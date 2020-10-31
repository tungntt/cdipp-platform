package vn.tungnt.study.cdipp.importer.converter;

public class ConversionException extends RuntimeException {

    public ConversionException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public ConversionException(String msg) {
        super(msg);
    }
}
