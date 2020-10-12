package by.epamtc.rumiantsau.dao.exception;

public class ConnectionPoolError extends Error {

    public ConnectionPoolError() {
    }

    public ConnectionPoolError(String message) {
        super(message);
    }

    public ConnectionPoolError(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectionPoolError(Throwable cause) {
        super(cause);
    }
}
