package sprint1.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sprint1.db.DBManager;
import sprint1.db.Task;

import java.io.IOException;

@WebServlet(value = "/details-sprint1")

public class Details extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = -1;
        try {
            id = Integer.parseInt(req.getParameter("task_id"));
        }catch (Exception e){}
        Task task = DBManager.getTaskId(id);
        req.setAttribute("task", task);
        req.getRequestDispatcher("details_sprint1.jsp").forward(req, resp);
    }
}
