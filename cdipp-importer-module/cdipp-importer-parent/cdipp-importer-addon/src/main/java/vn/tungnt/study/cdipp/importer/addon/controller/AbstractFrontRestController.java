package vn.tungnt.study.cdipp.importer.addon.controller;

import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author nttung 1/4/20
 * @project cdipp-importer-parent
 */
public abstract class AbstractFrontRestController<T, R, P> extends AbstractFrontController<T, R, P>
        implements FrontController<T, R> {

    @PostMapping("/receive")
    @Override
    public T receivedCustomerData(R requestData) {
        return this.processCustomerData(requestData);
    }
}

