package by.epamtc.rumiantsau.controller.command.impl;

import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.bean.User;
import by.epamtc.rumiantsau.controller.Encoder;
import by.epamtc.rumiantsau.controller.command.Command;
import by.epamtc.rumiantsau.controller.UserValidator;
import by.epamtc.rumiantsau.service.ServiceProvider;
import by.epamtc.rumiantsau.service.UserService;
import by.epamtc.rumiantsau.service.exception.ServiceException;
import by.epamtc.rumiantsau.service.exception.UserNotFoundServiceException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

public class AuthCommand implements Command {

    private static final Logger logger = LogManager.getLogger(AuthCommand.class);

    private static final String PARAMETER_LOGIN = "login";
    private static final String PARAMETER_PASSWORD = "password";
    private static final String PARAMETER_WRONG_DATA = "message=wrong_data";
    private static final String PARAMETER_LOGIN_ERROR = "message=login_error";
    private static final String PARAMETER_INCORRECT_DATA = "message=incorrect_data";

    private static final String ATTRIBUTE_USER = "user";

    private static final String LOGIN_PAGE = "mainController?command=go_to_login_page";
    private static final String USER_PAGE = "mainController?command=go_to_user_page&user_data=orders";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page;

        String login = req.getParameter(PARAMETER_LOGIN);
        String password = req.getParameter(PARAMETER_PASSWORD);

        InfoForAuthorization authData = new InfoForAuthorization();
        authData.setLogin(login);
        authData.setPassword(password);

        if (UserValidator.loginValidation(authData)) {
            ServiceProvider serviceProvider = ServiceProvider.getInstance();
            UserService userService = serviceProvider.getUserService();

            try {
                password = Encoder.encrypt(password);
                authData.setPassword(password);

                User user = userService.authorization(authData);
                req.getSession().setAttribute(ATTRIBUTE_USER, user);
                logger.info("User is authorized");
                page = USER_PAGE;
            } catch (UserNotFoundServiceException e) {
                logger.info("User has entered incorrect data");
                page = LOGIN_PAGE + "&" + PARAMETER_WRONG_DATA;
            } catch (NoSuchAlgorithmException | ServiceException e) {
                page = LOGIN_PAGE + "&" + PARAMETER_LOGIN_ERROR;
            }
        } else {
            page = LOGIN_PAGE + "&" + PARAMETER_INCORRECT_DATA;
        }

        resp.sendRedirect(page);
    }
}
