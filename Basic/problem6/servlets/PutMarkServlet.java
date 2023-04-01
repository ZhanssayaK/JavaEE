package problem6.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem6.db.DataBase;
import problem6.db.Student;

import java.io.IOException;

@WebServlet(value = "/put-mark")
public class PutMarkServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullname");
        String mark = req.getParameter("mark");

        Student s = new Student();
        s.setName(name);
        s.setMark(Integer.parseInt(mark));

        DataBase.addStudent(s);

        resp.sendRedirect("/home6");
    }
}
