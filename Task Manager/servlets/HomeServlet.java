package sprint1.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sprint1.db.DBManager;
import sprint1.db.Task;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/home-sprint1")

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Task> tasks = DBManager.getTask();
        req.setAttribute("tasks", tasks);
        req.getRequestDispatcher("home-sprint1.jsp").forward(req, resp);
    }
}
