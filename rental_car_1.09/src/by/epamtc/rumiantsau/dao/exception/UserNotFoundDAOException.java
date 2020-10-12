package by.epamtc.rumiantsau.dao.exception;

public class UserNotFoundDAOException extends DAOException {

    public UserNotFoundDAOException() {
    }

    public UserNotFoundDAOException(String message) {
        super(message);
    }

    public UserNotFoundDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundDAOException(Throwable cause) {
        super(cause);
    }
}
