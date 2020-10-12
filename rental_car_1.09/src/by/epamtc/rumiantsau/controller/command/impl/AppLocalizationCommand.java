package by.epamtc.rumiantsau.controller.command.impl;

import by.epamtc.rumiantsau.controller.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AppLocalizationCommand implements Command {

    private static final String PARAMETER_LOCAL = "local";
    private static final String PARAMETER_PREVIOUS_COMMAND = "previous_command";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String local = req.getParameter(PARAMETER_LOCAL);
        String previousCommand = req.getParameter(PARAMETER_PREVIOUS_COMMAND);
        req.getSession().setAttribute(PARAMETER_LOCAL, local);
        resp.sendRedirect("mainController?command=" + previousCommand);
    }
}
