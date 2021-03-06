package vn.tungnt.study.cdipp.importer.controller;

/**
 * @author nttung 12/23/19
 * @project cdipp-importer-parent
 */
abstract class AbstractFrontController <T, R, P> {

    protected final T processCustomerData(R requestData) {
        final P processingData = this.transform(requestData);
        this.pushToQueue(processingData);
        return this.postBackStatus();
    }

    protected abstract P transform(R requestData);

    protected abstract void pushToQueue(P processingData);

    protected abstract T postBackStatus();
}

