package vn.tungnt.study.cdipp.importer.addon.controller;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
public abstract class AbstractFrontRestController<T, R, P> extends AbstractFrontController<T, R, P>
    implements FrontRestController<T, R> {

    @Override
    public T receivedCustomerData(R requestData) {
        return this.processCustomerData(requestData);
    }
}

