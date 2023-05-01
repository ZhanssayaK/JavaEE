package sprint1.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sprint1.db.DBManager;
import sprint1.db.Task;

import java.io.IOException;

@WebServlet(value = "/add-task")

public class AddTask extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("task_name");
        String descr = req.getParameter("task_details");
        String date = req.getParameter("task_date");

        Task task = new Task();
        task.setName(name);
        task.setDescription(descr);
        task.setDate(date);

        DBManager.addTask(task);
        resp.sendRedirect("home-sprint1");
    }
}
