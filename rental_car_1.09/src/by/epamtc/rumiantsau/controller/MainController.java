package by.epamtc.rumiantsau.controller;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import by.epamtc.rumiantsau.controller.command.Command;
import by.epamtc.rumiantsau.controller.command.CommandProvider;




public class MainController extends HttpServlet {

    private final CommandProvider commandProvider = new CommandProvider();

    private static final String PARAM_COMMAND = "command";
    private static final String PARAM_LOCAL = "local";



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute(PARAM_LOCAL) == null) {
            session.setAttribute(PARAM_LOCAL, Locale.getDefault());
        }

        String commandName = request.getParameter(PARAM_COMMAND);
        Command command = commandProvider.getCommand(commandName.toUpperCase());
        if (command != null) {
            command.execute(request, response);
        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

}
