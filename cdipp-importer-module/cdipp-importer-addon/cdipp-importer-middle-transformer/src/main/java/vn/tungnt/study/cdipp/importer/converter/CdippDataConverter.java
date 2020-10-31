package vn.tungnt.study.cdipp.importer.converter;

import org.springframework.util.CollectionUtils;
import vn.tungnt.study.cdipp.importer.model.AbstractCdippImporterModel;

import java.util.*;

public interface CdippDataConverter<SOURCE extends AbstractCdippImporterModel, TARGET> {

    TARGET convert(SOURCE source) throws ConversionException;

    default List<TARGET> convertAll(Collection<SOURCE> sources) throws ConversionException {
        if (CollectionUtils.isEmpty(sources)) {
            return Collections.emptyList();
        } else {
            List<TARGET> result = new ArrayList<>(sources.size());
            final Iterator<SOURCE> iterator = sources.iterator();

            while(iterator.hasNext()) {
                result.add(this.convert(iterator.next()));
            }

            return result;
        }
    }
}
