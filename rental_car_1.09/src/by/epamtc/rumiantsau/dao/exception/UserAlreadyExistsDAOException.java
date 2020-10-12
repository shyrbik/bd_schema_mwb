package by.epamtc.rumiantsau.dao.exception;

public class UserAlreadyExistsDAOException extends DAOException {

    public UserAlreadyExistsDAOException() {
    }

    public UserAlreadyExistsDAOException(String message) {
        super(message);
    }

    public UserAlreadyExistsDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyExistsDAOException(Throwable cause) {
        super(cause);
    }
}
