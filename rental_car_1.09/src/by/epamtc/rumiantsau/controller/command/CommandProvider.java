package by.epamtc.rumiantsau.controller.command;

import by.epamtc.rumiantsau.controller.command.impl.*;
import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private final Map<ParamName, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(ParamName.AUTHORIZATION, new AuthCommand());
        commands.put(ParamName.LOGOUT, new LogoutCommand());
        commands.put(ParamName.REGISTRATION, new RegistrationCommand());
        commands.put(ParamName.GO_TO_MAIN_PAGE, new GoToMainPageCommand());
        commands.put(ParamName.GO_TO_USER_PAGE, new GoToUserPageCommand());
        commands.put(ParamName.GO_TO_LOGIN_PAGE, new GoToLoginPageCommand());
        commands.put(ParamName.GO_TO_REGISTRATION_PAGE, new GoToRegPageCommand());
        commands.put(ParamName.GO_TO_CONTACT_PAGE, new GoToContactPageCommand());
        commands.put(ParamName.GO_TO_CARS_PAGE, new GoToCarsPageCommand());
        commands.put(ParamName.GO_TO_TERMS_OF_RENT, new GoToTermsOfRentPageCommand());
        commands.put(ParamName.APP_LOCALIZATION, new AppLocalizationCommand());
    }

    public Command getCommand(String commandName) {
        Command command = null;
        try {
            command = commands.get(ParamName.valueOf(commandName.toUpperCase()));
        } catch (IllegalArgumentException ignore) {}
        return command;
    }
}
