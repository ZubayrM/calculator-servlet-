package project;


import javax.servlet.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeFilter implements Filter {

    private LocalDateTime date;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        date = LocalDateTime.now();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.printf("%s:%s:%s\n", date.getHour(), date.getMinute(), date.getSecond());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
