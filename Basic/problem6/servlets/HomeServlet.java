package problem6.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import problem6.db.DataBase;
import problem6.db.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home6")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.print("<form action = '/put-mark' method = 'post'>");
        out.print("<table cellpadding='15'>");
        out.print("<tr>");
        out.print("<td>FULL NAME: </td>");
        out.print("<td><input type='text' name='fullname'></td>");
        out.print("</tr>");
        out.print("<tr>");
        out.print("<td>EXAM POINTS: </td>");
        out.print("<td><input type='number' name='mark'></td>");
        out.print("</tr>");
        out.print("</table>");
        out.print("<button>SUBMIT EXAM</button>");
        out.print("</form>");

        ArrayList<Student> s = DataBase.getStudent();
        for (Student student : s){
            if (student.getMark() >= 90){
                out.print("<h3>" + student.getName() + " got 'A' " + "</h3><hr>");
            }
            else if (student.getMark() >= 75 && student.getMark()<=89){
                out.print("<h3>" + student.getName() + " got 'B' " + "</h3><hr>");
            }
            else if (student.getMark() >= 60 && student.getMark()<=74){
                out.print("<h3>" + student.getName() + " got 'C' " + "</h3><hr>");
            }
            else if (student.getMark() >= 50 && student.getMark()<=59){
                out.print("<h3>" + student.getName() + " got 'D' " + "</h3><hr>");
            }
            else{
                out.print("<h3>" + student.getName() + " got 'F' " + "</h3><hr>");
            }
        }

    }
}
