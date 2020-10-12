package by.epamtc.rumiantsau.controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ExceptionHandler extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(ExceptionHandler.class);

    private static final String EXCEPTION_ATTRIBUTE = "exception";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");

        if (throwable != null) {
            logger.error("Occurred exception", throwable);
            req.setAttribute(EXCEPTION_ATTRIBUTE, throwable);
        }
        logger.error("Go to error page, code 500");
        req.getRequestDispatcher("/WEB-INF/jsp/500.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
