package problem7.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem7.db.DBManager;
import problem7.db.Footballer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home7")

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<form action = '/add-footballer' method = 'post'>");
        out.print("<table cellpadding='15'>");
        out.print("<tr>");
        out.print("<td>NAME: </td>");
        out.print("<td><input type='text' name='name' placeholder='Insert Name'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>SURNAME: </td>");
        out.print("<td><input type='text' name='surname' placeholder='Insert Surname'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>CLUB: </td>");
        out.print("<td><select name='club'>" +
                "<option>Real Madrid</option>" +
                "<option>Barcelona</option>" +
                "<option>PSG</option>" +
                "</select></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>SALARY: </td>");
        out.print("<td><input type='number' name='salary' placeholder='Insert Salary'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>TRANSFER PRICE: </td>");
        out.print("<td><input type='number' name='price' placeholder='Insert Transfer Price'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<tr>");
        out.print("<td>PRESS BUTTON TO ADD FOOTBALLER => </td>");
        out.print("<td><button style='background-color:blue; color:white;'>ADD FOOTBALLER</button>");
        out.print("</tr>");
        out.print("</table>");
        out.print("</form>");

        ArrayList<Footballer> arr = DBManager.getFootballers();

        for(Footballer f : arr){
            out.print("<hr>");
            out.print("<h4 style='color:darkgreen;'>" + f.getName() +" "+ f.getSurname() + "</h4>");
            out.print("<h4 style='color:blue;'>" + "CLUB: "+ f.getClub() + "</h4>");
            out.print("<h4 style='color:red;'>" + " SALARY: "+ f.getSalary() + "</h4>");
            out.print("<h4 style='color:red;'>" + " TRANSFER PRICE: "+ f.getSalary() + "</h4>");
        }

    }
}
