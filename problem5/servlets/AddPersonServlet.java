package problem5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem5.db.Person;
import problem5.db.dataBase;

import java.io.IOException;

@WebServlet(value = "/addPerson")
public class AddPersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullname");
        String age = req.getParameter("age");
        String gender = req.getParameter("gender");

        Person p = new Person();
        p.setName(name);
        p.setAge(Integer.parseInt(age));
        p.setGender(gender);

        dataBase.addPerson(p);

        resp.sendRedirect("/home5");
    }
}
