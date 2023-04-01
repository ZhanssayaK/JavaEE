package first_ex.servlets;

import first_ex.db.DBManager;
import first_ex.db.Personal;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = '/add-person' method = 'POST'>");
        out.print("<input type='text' name='person_name'>NAME<br><br>");
        out.print("<input type='text' name='person_surname'>SURNAME<br><br>");
        out.print("<input type='text' name='person_department'>DEPARTMENT<br><br>");
        out.print("<input type='number' name='person_salary'>SALARY<br><br>");
        out.print("<button>ADD PERSON</button><br><br>");
        out.print("</form>");

        out.print("<hr>");

        ArrayList<Personal> personal = DBManager.getPersonal();

        for(Personal p : personal){
            out.print("<hr>");
            out.print("<h4>" + p.getName() +" "+ p.getSurname() + "</h4>");
            out.print("<h4 style='color:darkgreen;'>" + "Department: "+ p.getDepartment() + "</h4>");
            out.print("<h4 style='color:darkgreen;'>" + " Salary: "+ p.getSalary() + "</h4>");

            out.print("<hr>");
        }
    }
}
