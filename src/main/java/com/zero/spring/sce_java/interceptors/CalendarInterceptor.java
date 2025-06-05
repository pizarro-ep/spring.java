package com.zero.spring.sce_java.interceptors;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CalendarInterceptor implements HandlerInterceptor {

    @Value("${config.calendar.open}")
    private int open;
    @Value("${config.calendar.close}")
    private int close;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= open && hour <= close) {
            StringBuilder sb = new StringBuilder("Bienvenido");
            sb.append("Atendemos desde las: ");
            sb.append(open);
            sb.append("AM");
            sb.append("hasta las");
            sb.append(open);
            sb.append("PM");
            sb.append("Gracias por su visita");
            request.setAttribute("Mensaje", sb.toString());
            return true;
        }
        return true;
    }

}
