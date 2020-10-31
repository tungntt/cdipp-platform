package vn.tungnt.study.cdipp.importer.model;

import java.time.LocalDateTime;

public class AbstractCdippImporterCustomerModel {

    protected String customerId;

    protected String projectId;

    protected LocalDateTime receivedTime;

    protected LocalDateTime returnedTime;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(final String projectId) {
        this.projectId = projectId;
    }

    public LocalDateTime getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(final LocalDateTime receivedTime) {
        this.receivedTime = receivedTime;
    }

    public LocalDateTime getReturnedTime() {
        return returnedTime;
    }

    public void setReturnedTime(final LocalDateTime returnedTime) {
        this.returnedTime = returnedTime;
    }
}
