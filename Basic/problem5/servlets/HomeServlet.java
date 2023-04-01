package problem5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem5.db.Person;
import problem5.db.dataBase;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home5")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<form action = '/addPerson' method = 'post'>");
        out.print("<table cellpadding='15'>");
        out.print("<tr>");
        out.print("<td>Full Name: </td>");
        out.print("<td><input type='text' name='fullname'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Age: </td>");
        out.print("<td><input type='number' name='age'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>Gender: </td>");
        out.print("<td><input type='radio' name='gender' value='MALE'>MALE</td>");
        out.print("<td><input type='radio' name='gender' value='FEMALE'>FEMALE</td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("<button>SEND</button>");
        out.print("</form>");

        ArrayList<Person> arr = dataBase.getPerson();


        for (Person p : arr){
            if (p.getAge()>=18 && p.getGender().equals("MALE")){
                out.print("<h4>" + "Hello Dear Mister " + p.getName() + "</h4>");
            }
            else if (p.getAge()<18 && p.getGender().equals("FEMALE")){
                out.print("<h4>" + "Hello Dude Miss " + p.getName() + "</h4>");
            }
        }
    }
}
