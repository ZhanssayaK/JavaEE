package problem4.servlets;

import jakarta.servlet.annotation.WebServlet;
import problem4.db.Person;
import problem4.db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/order")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String food = req.getParameter("food");

        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setFood(food);

        DBManager.orderFood(person);

        resp.sendRedirect("/home4");
    }
}
