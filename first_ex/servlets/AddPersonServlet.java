package first_ex.servlets;

import first_ex.db.DBManager;
import first_ex.db.Personal;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/add-person")
public class AddPersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("person_name");
        String surname = request.getParameter("person_surname");
        String department = request.getParameter("person_department");
        String salary = request.getParameter("person_salary");

        double salaryVal = Double.parseDouble(salary);

        Personal personal = new Personal();
        personal.setName(name);
        personal.setSurname(surname);
        personal.setDepartment(department);
        personal.setSalary(salaryVal);

        DBManager.addPerson(personal);

        response.sendRedirect("/home");


    }
}
