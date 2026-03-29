package Lesson24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/age")
public class CheckAgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String ageLine = req.getParameter("age");

        if (ageLine == null || ageLine.isBlank()) {
            writer.println("<h3>Age parameter is missing</h3>");
            writer.close();
            return;
        }

        try {
            double age = Double.parseDouble(ageLine);

            if (age < 18)
                writer.println("<h3>Age under 18</h3>");
            else
                writer.println("<h3>Is adult</h3>");

        }
        catch (NumberFormatException e)
        {
            writer.println("<h3>Age must be a number</h3>");
        }

        writer.close();
    }
}
