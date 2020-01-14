package vn.tungnt.study.cdipp.importer.addon.model.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


/**
 * @author nttung 11/23/19
 * @project cdipp-importer-parent
 */
public class DefaultCdippRequestRestModel implements Serializable {

    private static final long serialVersionUID = -2042373575439420922L;

    @JsonProperty(value = "project_id", defaultValue = "")
    private String projectId;

    @JsonProperty(value = "customer_id", defaultValue = "")
    private String customerId;

    @JsonProperty(value = "imported_date_time", defaultValue = "")
    private String importedDateTime;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getImportedDateTime() {
        return importedDateTime;
    }

    public void setImportedDateTime(String importedDateTime) {
        this.importedDateTime = importedDateTime;
    }
}

