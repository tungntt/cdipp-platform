package vn.tungnt.study.cdipp.importer.addon.controller;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
public interface FrontController<T, R> {

    T receivedCustomerData(R requestData);
}