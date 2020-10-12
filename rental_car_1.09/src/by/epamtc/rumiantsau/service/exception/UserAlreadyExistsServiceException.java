package by.epamtc.rumiantsau.service.exception;

public class UserAlreadyExistsServiceException extends ServiceException {

    public UserAlreadyExistsServiceException() {
    }

    public UserAlreadyExistsServiceException(String message) {
        super(message);
    }

    public UserAlreadyExistsServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistsServiceException(Throwable cause) {
        super(cause);
    }
}
