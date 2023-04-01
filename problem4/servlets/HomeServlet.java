package problem4.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem4.db.DBManager;
import problem4.db.Person;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home4")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<form action='/order' method='POST'>");
        out.print("<table cellpadding='15'>");
        out.print("<tr>");
        out.print("<td>Name: </td>");
        out.print("<td><input type='text' name='name'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Surname: </td>");
        out.print("<td><input type='text' name='surname'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Food: </td>");
        out.print("<td><select name='food'>" +
                "<option>Manty</option>" +
                "<option>Pizza</option>" +
                "<option>Plov</option>" +
                "</select></td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("<button>ORDER</button>");
        out.print("</form>");

        ArrayList<Person> p = DBManager.getPerson();

        for (Person person : p){
            out.print("<h4>" + person.getName() +" " +person.getSurname() +" ordered " + person.getFood() + "</h4>");
        }



    }
}
