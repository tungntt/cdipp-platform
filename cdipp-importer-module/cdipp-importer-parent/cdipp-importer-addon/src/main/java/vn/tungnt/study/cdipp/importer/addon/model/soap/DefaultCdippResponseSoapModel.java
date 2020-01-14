package vn.tungnt.study.cdipp.importer.addon.model.soap;

import java.io.Serializable;


/**
 * @author nttung 11/23/19
 * @project cdipp-importer-parent
 */
public class DefaultCdippResponseSoapModel implements Serializable {

    private static final long serialVersionUID = 2977316936963408668L;

    private boolean isValid;

    // TODO: will move error class to cdipp-model-project
    private CdippImporterError error;

    public boolean isValid() {
        return this.isValid;
    }

    public CdippImporterError getError() {
        return this.error;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public void setError(CdippImporterError error) {
        this.error = error;
    }

    public static class CdippImporterError implements Serializable {

        private static final long serialVersionUID = 4839099553206357671L;

        private String errorId;
        private String errorMessage;

        public String getErrorId() {
            return errorId;
        }

        public void setErrorId(String errorId) {
            this.errorId = errorId;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }
    }

}

