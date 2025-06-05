package com.zero.spring.sce_java.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "inicio";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        long TiempoInicio = System.currentTimeMillis();
        request.setAttribute(START_TIME, TiempoInicio);
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        long TiempoInicio = (Long) request.getAttribute(START_TIME);
        long TiempoFinal = System.currentTimeMillis() - TiempoInicio;
        System.out.println("Tiempo de ejecucion: " + TiempoFinal + "ms para URL " + request.getRequestURI());
    }
}
