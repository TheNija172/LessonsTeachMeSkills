package Lesson25;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Server started");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Server closed");
    }
}
