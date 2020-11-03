package vn.tungnt.study.cdipp.importer.controller.rest;

import vn.tungnt.study.cdipp.importer.controller.AbstractAdaptiveController;
import vn.tungnt.study.cdipp.importer.controller.strategy.CdippControllerStrategy;
import vn.tungnt.study.cdipp.importer.fsm.CdippStateManager;


public abstract class AbstractRestController<INPUT, OUTPUT> extends AbstractAdaptiveController<INPUT, OUTPUT> {

    public AbstractRestController(final CdippStateManager<INPUT, OUTPUT> stateManager) {
        super(stateManager);
    }

    public AbstractRestController(final CdippStateManager<INPUT, OUTPUT> stateManager,
                                  final CdippControllerStrategy<INPUT, OUTPUT> strategy) {
        super(stateManager, strategy);
    }

    @Override
    public OUTPUT processCustomerData(final INPUT requestData) {
        return null;
    }
}
