package com.vaishnavi.cab.booking.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AuthInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("AuthInterceptor - Checking authorization for: {}", request.getRequestURI());

        // TODO: Add your auth logic here (e.g., check session/token)
        return true;
    }

    // Optional: Override postHandle and afterCompletion if needed
}


