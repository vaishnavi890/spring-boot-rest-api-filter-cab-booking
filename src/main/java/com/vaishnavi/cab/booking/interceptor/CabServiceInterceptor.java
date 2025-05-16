package com.vaishnavi.cab.booking.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CabServiceInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(CabServiceInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        logger.info("CabServiceInterceptor -> preHandle(): " +
                request.getQueryString() + " :: Request URL = " + request.getRequestURL().toString()
                + " :: Start Time = " + startTime);
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        logger.info("CabServiceInterceptor -> postHandle(): Request URL = " +
                request.getRequestURL().toString() + " :: Current Time = " + System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception exception) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        logger.info("CabServiceInterceptor -> afterCompletion(): Request URL = " +
                request.getRequestURL().toString() + " :: End Time = " + endTime);
        logger.info("CabServiceInterceptor -> Time Taken = " + (endTime - startTime) + " ms");
    }
}

