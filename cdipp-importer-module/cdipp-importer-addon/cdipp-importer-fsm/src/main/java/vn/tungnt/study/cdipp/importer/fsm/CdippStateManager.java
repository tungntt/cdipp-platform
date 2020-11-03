package vn.tungnt.study.cdipp.importer.fsm;

public interface CdippStateManager<I, O> {

    O beginProcess(I input);
}
