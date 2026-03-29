package Lesson24;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/minsk")
public class TimeInMinskServlet extends HttpServlet {
    private final String zone = "Europe/Minsk";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>" + ZonedDateTime.now(ZoneId.of(zone)).format(DateTimeFormatter.ofPattern("HH:mm")) + " - Minsk </h1>");
        writer.close();
        super.doGet(req, resp);
    }
}
