package project;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CountFilter implements Filter {

    private Map<String, Integer> count;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        count = new TreeMap<>();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String key = servletRequest.getLocalAddr();
       count.compute(key,(k,v) -> v == null? 1 : ++v);
        filterChain.doFilter(servletRequest,servletResponse);

        if (count.get(key) > 15)
            throw new CountException();
        else System.out.println(count.get(key) + " " + key);

    }

    @Override
    public void destroy() {

    }
}
