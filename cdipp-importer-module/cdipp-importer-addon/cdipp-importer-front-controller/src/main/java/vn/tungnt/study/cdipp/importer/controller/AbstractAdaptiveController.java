package vn.tungnt.study.cdipp.importer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import vn.tungnt.study.cdipp.importer.controller.strategy.CdippControllerStrategy;
import vn.tungnt.study.cdipp.importer.fsm.CdippStateManager;

public abstract class AbstractAdaptiveController<INPUT, OUTPUT>
        implements FrontController<INPUT, OUTPUT> {

    private final CdippStateManager<INPUT, OUTPUT> stateManager;

    private CdippControllerStrategy<INPUT, OUTPUT> strategy;

    public AbstractAdaptiveController(@Autowired final CdippStateManager<INPUT, OUTPUT> stateManager) {
        this.stateManager = stateManager;
    }

    public AbstractAdaptiveController(final CdippStateManager<INPUT, OUTPUT> stateManager,
                                      final CdippControllerStrategy<INPUT, OUTPUT> strategy) {
        this.stateManager = stateManager;
        this.strategy = strategy;
    }

    protected void beforeProcess(final INPUT request) {
        if (null != this.strategy) {
            this.strategy.beforeProcess(request);
        }
    }

    protected void afterProcess(final OUTPUT response) {
        if (null != strategy) {
            this.strategy.afterProcess(response);
        }
    }

    protected final OUTPUT process(final INPUT request) {
        this.beforeProcess(request);
        final OUTPUT response = this.stateManager.beginProcess(request);
        this.afterProcess(response);
        return response;
    }

    protected CdippStateManager<INPUT, OUTPUT> getStateManager() {
        return stateManager;
    }
}
