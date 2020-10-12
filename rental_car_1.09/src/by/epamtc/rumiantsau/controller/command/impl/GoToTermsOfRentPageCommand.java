package by.epamtc.rumiantsau.controller.command.impl;

import by.epamtc.rumiantsau.controller.command.Command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToTermsOfRentPageCommand implements Command {

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/termsOfRent.jsp").forward(req, resp);
    }
}
