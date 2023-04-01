package problem7.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem7.db.DBManager;
import problem7.db.Footballer;

import java.io.IOException;

@WebServlet(value = "/add-footballer")

public class AddFootballerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String club = req.getParameter("club");
        String salary = req.getParameter("salary");
        String price = req.getParameter("price");

        Footballer f = new Footballer();
        f.setName(name);
        f.setSurname(surname);
        f.setClub(club);
        f.setSalary(Integer.parseInt(salary));
        f.setPrice(Integer.parseInt(price));

        DBManager.addFootballer(f);

        resp.sendRedirect("/home7");
    }
}
