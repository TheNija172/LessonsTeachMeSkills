package Lesson25;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.time.LocalDateTime;


@WebFilter("/*")
public class LogsFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Request time: " + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
