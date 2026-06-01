package Lesson28;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save-request")
public class SaveRequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String age = req.getParameter("age");

        if (name.isEmpty() || name == null || age.isEmpty() || age == null) {
            resp.sendRedirect("save-request.jsp");
            return;
        }

        req.setAttribute("name", name);
        req.setAttribute("age", age);

        req.getRequestDispatcher("request-success.jsp").forward(req, resp);
    }
}
