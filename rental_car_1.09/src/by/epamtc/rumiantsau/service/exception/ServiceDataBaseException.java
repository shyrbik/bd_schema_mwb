package by.epamtc.rumiantsau.service.exception;

public class ServiceDataBaseException extends ServiceException {

    public ServiceDataBaseException() {
    }

    public ServiceDataBaseException(String message) {
        super(message);
    }

    public ServiceDataBaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceDataBaseException(Throwable cause) {
        super(cause);
    }
}
