package Lesson25;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/book")
public class DownloadBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File book = new File("D:\\Word\\TeachMeSkills\\LessonsTeachMeSkills\\src\\main\\webapp\\Book.jsp");

        resp.setContentType("application/pdf");
        resp.setHeader("Content-Disposition", "attachment; filename=testBook.pdf");
        resp.setContentLength((int) book.length());

        try (FileInputStream inputStream = new FileInputStream(book);
             ServletOutputStream outputStream = resp.getOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}
