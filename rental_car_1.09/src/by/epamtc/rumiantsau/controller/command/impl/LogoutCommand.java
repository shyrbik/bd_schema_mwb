package by.epamtc.rumiantsau.controller.command.impl;

import by.epamtc.rumiantsau.controller.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutCommand implements Command {

    private static final String MAIN_PAGE = "mainController?command=go_to_main_page";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.removeAttribute("user");
        }
        resp.sendRedirect(MAIN_PAGE);
    }
}
