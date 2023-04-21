package sprint1.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sprint1.db.DBManager;
import sprint1.db.Task;

import java.io.IOException;

@WebServlet(value = "/edit-task")

public class EditTask extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("task_name");
        int id = Integer.parseInt(req.getParameter("task_id"));
        String details = req.getParameter("task_details");
        String date = req.getParameter("task_date");
        String done = req.getParameter("task_done");

        Task task = DBManager.getTaskId(id);
        if (task!=null){
            task.setName(name);
            task.setDate(date);
            task.setDescription(details);
            task.setFlag(done);

            DBManager.updateTask(task);
            resp.sendRedirect("/details-sprint1?task_id="+id);
        } else {
            resp.sendRedirect("/home-sprint1");
        }
    }
}
