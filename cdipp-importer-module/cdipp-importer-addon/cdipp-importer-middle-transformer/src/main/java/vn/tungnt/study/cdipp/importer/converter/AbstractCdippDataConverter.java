package vn.tungnt.study.cdipp.importer.converter;

import org.springframework.stereotype.Service;
import vn.tungnt.study.cdipp.importer.converter.populator.CdippDataPopulator;
import vn.tungnt.study.cdipp.importer.model.AbstractCdippImporterModel;

import java.util.List;

@Service
abstract class AbstractCdippDataConverter<SOURCE extends AbstractCdippImporterModel, TARGET>
        implements CdippDataConverter<SOURCE, TARGET> {

    private Class<TARGET> targetClass;

    protected List<CdippDataPopulator<SOURCE, TARGET>> populators;

    private String beanName;

    public AbstractCdippDataConverter(final List<CdippDataPopulator<SOURCE, TARGET>> populators) {
        this.populators = populators;
    }

    public TARGET convert(final SOURCE source) throws ConversionException {
        if (targetClass == null) {
            throw new NullPointerException();
        }
        final TARGET target = createFromClass();
        populate(source, target);
        return target;
    }

    protected abstract void populate(final SOURCE source, final TARGET target);

    protected TARGET createFromClass()
    {
        try {
            return targetClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void setTargetClass(final Class<TARGET> targetClass) {
        this.targetClass = targetClass;
    }

    protected String getBeanName() {
        return beanName;
    }

    public void setBeanName(final String beanName) {
        this.beanName = beanName;
    }
}
