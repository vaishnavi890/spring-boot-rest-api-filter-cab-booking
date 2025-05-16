package com.vaishnavi.cab.booking.filters;

import jakarta.servlet.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CabBookingFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(CabBookingFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("CabBookingFilter initialized...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("[CabBookingFilter] Remote Host: {}", request.getRemoteHost());
        logger.info("[CabBookingFilter] Remote Address: {}", request.getRemoteAddr());

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info("CabBookingFilter destroyed...");
    }
}

