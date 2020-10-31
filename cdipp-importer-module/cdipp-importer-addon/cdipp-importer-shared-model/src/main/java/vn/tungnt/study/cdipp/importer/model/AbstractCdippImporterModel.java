package vn.tungnt.study.cdipp.importer.model;

public class AbstractCdippImporterModel<C extends AbstractCdippImporterCustomerModel,
                                        P extends AbstractCdippImporterProcessingModel> {

    protected final C customerModel;

    protected final P processingModel;

    public AbstractCdippImporterModel(final C customerModel, final P processingModel) {
        this.customerModel = customerModel;
        this.processingModel = processingModel;
    }

    public C getCustomerModel() {
        return customerModel;
    }

    public P getProcessingModel() {
        return processingModel;
    }
}
