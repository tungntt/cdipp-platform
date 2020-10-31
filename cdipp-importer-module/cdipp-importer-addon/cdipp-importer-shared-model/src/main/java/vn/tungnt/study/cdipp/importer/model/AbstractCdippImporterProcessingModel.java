package vn.tungnt.study.cdipp.importer.model;

import java.time.LocalDateTime;

public class AbstractCdippImporterProcessingModel {

    protected LocalDateTime beginTime;

    protected LocalDateTime endTime;

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(final LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(final LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
