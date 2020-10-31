package vn.tungnt.study.cdipp.importer.service;

import vn.tungnt.study.cdipp.importer.converter.CdippDataConverter;

public abstract class AbstractCdippDataTransformerService {

    private final CdippDataConverter converter;

    public AbstractCdippDataTransformerService(final CdippDataConverter converter) {
        this.converter = converter;
    }
}
