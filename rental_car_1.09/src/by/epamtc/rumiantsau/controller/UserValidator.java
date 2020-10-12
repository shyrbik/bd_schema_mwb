package by.epamtc.rumiantsau.controller;

import by.epamtc.rumiantsau.bean.InfoForAuthorization;
import by.epamtc.rumiantsau.bean.InfoForRegistration;

public class UserValidator {

    private static final String LOGIN_REGEXP = "^[a-zA-Z0-9_-]{3,25}$";
    private static final String PASSWORD_REGEXP = "^[^\\s]{6,18}$";
    private static final String EMAIL_REGEXP = "^[\\w.-_]+@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}$";
    private static final String PHONE_REGEXP = "^[0-9\\(\\)-+\\s]+$";

    public static boolean loginValidation(InfoForAuthorization data) {
        String login = data.getLogin();
        String password = data.getPassword();

        return login != null && password != null
                && login.matches(LOGIN_REGEXP) && password.matches(PASSWORD_REGEXP);
    }

    public static boolean registrationValidation(InfoForRegistration data) {
        String login = data.getLogin();
        String password = data.getPassword();
        String phone = data.getPhone();
        String email = data.getEmail();

        if (email != null && email.length() > 0 && !email.matches(EMAIL_REGEXP)) {
            return false;
        }

        if (login != null && password != null && phone != null) {
            return login.matches(LOGIN_REGEXP) && password.matches(PASSWORD_REGEXP)
                    && phone.matches(PHONE_REGEXP);
        } else {
            return false;
        }
    }
}
