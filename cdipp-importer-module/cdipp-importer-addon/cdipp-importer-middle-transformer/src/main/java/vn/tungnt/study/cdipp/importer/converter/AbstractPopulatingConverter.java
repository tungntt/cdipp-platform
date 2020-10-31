package vn.tungnt.study.cdipp.importer.converter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import vn.tungnt.study.cdipp.importer.converter.populator.CdippDataPopulator;
import vn.tungnt.study.cdipp.importer.model.AbstractCdippImporterModel;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@Slf4j
public abstract class AbstractPopulatingConverter<SOURCE extends AbstractCdippImporterModel, TARGET>
        extends AbstractCdippDataConverter<SOURCE, TARGET> {

    public AbstractPopulatingConverter(final List<CdippDataPopulator<SOURCE, TARGET>> cdippDataPopulators) {
        super(cdippDataPopulators);
    }

    protected void populate(final SOURCE source, final TARGET target)
    {
        if (populators == null)
        {
            return;
        }

        for (final CdippDataPopulator<SOURCE, TARGET> populator : this.populators)
        {
            if (populator != null)
            {
                populator.populate(source, target);
            }
        }
    }

    @PostConstruct
    public void removeDuplicatedPopulators()
    {
        // CHECK for duplicated populators
        if (CollectionUtils.isNotEmpty(populators))
        {
            final LinkedHashSet<CdippDataPopulator<SOURCE, TARGET>> distinctPopulators = new LinkedHashSet<>();

            for (final CdippDataPopulator<SOURCE, TARGET> populator : populators)
            {
                if (!distinctPopulators.add(populator))
                {
                    log.warn("Duplicate populator entry [" + populator.getClass().getName() + "] found for converter "
                            + getBeanName() + "! The duplication has been removed.");
                }
            }
            this.populators = new ArrayList<>(distinctPopulators);
        }
        else
        {
            log.warn("Empty populators list found for converter " + getBeanName() + "!");
        }
    }
}
