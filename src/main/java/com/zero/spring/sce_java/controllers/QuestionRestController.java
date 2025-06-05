package com.zero.spring.sce_java.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.models.Users;
import com.zero.spring.sce_java.models.dto.ClaseDTO;

@RestController
@RequestMapping("/api")
public class QuestionRestController {

    // @RequestMapping(path = "/info2", method=RequestMethod.GET)
    @GetMapping("/info2")
    public ClaseDTO info2() {
        // public Map<String, Object> info2() {
        /*
         * Users user1 = new Users("user1", "name1", "surnames1", "email1",
         * "created_at1", "updated_at1", "last_login1");
         * 
         * Map<String, Object> response = new HashMap<>();
         * response.put("Usuario", "Datos de Usuario");
         * response.put("Usuario", user1);
         */

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Titulo 1");
        usuario1.setUsuario("Usuario 1");

        // return response;
        return usuario1;
    }
}
