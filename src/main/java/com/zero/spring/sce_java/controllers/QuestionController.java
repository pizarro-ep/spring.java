package com.zero.spring.sce_java.controllers;

import java.util.Arrays;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.zero.spring.sce_java.models.Users;

@Controller
public class QuestionController {

    @GetMapping("/info")
    public String info(Model model) {
        Users user1 = new Users("user1", "name1", "surnames1", "email1", "created_at1", "updated_at1", null);

        model.addAttribute("Titulo", "Servidor en línea");
        model.addAttribute("Servidor", "Zero");
        model.addAttribute("Ip", "192.168.1.1");
        model.addAttribute("User", user1);

        return "info";
    }

    @ModelAttribute("Users")
    public List<Users> ListUsers() {
        return Arrays.asList(new Users("user1", "name1", "surnames1", "email1", "created_at1", "updated_at1", null),
                new Users("user2", "name2", "surnames2", "email2", "created_at2", "updated_at2", null),
                new Users("user3", "name3", "surnames3", "email3", "created_at3", "updated_at3", null));
    }
}
