package vn.tungnt.study.cdipp.importer.controller.strategy;

public interface CdippControllerStrategy<REQ, RES> {

    void beforeProcess(final REQ request);

    void afterProcess(final RES response);
}
