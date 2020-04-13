package vn.tungnt.study.cdipp.importer.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.tungnt.study.cdipp.importer.controller.AbstractFrontRestController;
import vn.tungnt.study.cdipp.importer.controller.CdippRestController;
import vn.tungnt.study.cdipp.importer.model.DefaultCdippProcessingModel;
import vn.tungnt.study.cdipp.importer.model.rest.DefaultCdippRequestRestModel;
import vn.tungnt.study.cdipp.importer.model.rest.DefaultCdippResponseRestModel;


/**
 * @author nttung 12/6/19
 * @project cdipp-importer-parent
 */
@CdippRestController
public class DefaultFrontRestController extends AbstractFrontRestController<DefaultCdippResponseRestModel, DefaultCdippRequestRestModel, DefaultCdippProcessingModel> {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultFrontRestController.class);

    @Override
    protected DefaultCdippProcessingModel transform(DefaultCdippRequestRestModel requestData) {
        return null;
    }

    @Override
    protected void pushToQueue(DefaultCdippProcessingModel processingData) {

    }

    @Override
    protected DefaultCdippResponseRestModel postBackStatus() {
        DefaultCdippResponseRestModel responseModel = new DefaultCdippResponseRestModel();
        responseModel.setValid(true);
        return responseModel;
    }

}

