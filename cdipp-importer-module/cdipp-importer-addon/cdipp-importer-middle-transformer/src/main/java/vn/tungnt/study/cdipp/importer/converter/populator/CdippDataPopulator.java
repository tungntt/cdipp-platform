package vn.tungnt.study.cdipp.importer.converter.populator;

import vn.tungnt.study.cdipp.importer.model.AbstractCdippImporterModel;

public interface CdippDataPopulator<SOURCE extends AbstractCdippImporterModel, TARGET> {

    void populate(final SOURCE source, final TARGET target);
}
