package com.zero.spring.sce_java.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zero.spring.sce_java.models.Users;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.code}")
    private String code;
    @Value("${config.user}")
    private String user;
    @Value("${config.message}")
    private String message;
    @Value("${config.values}")
    private String[] values;

    @GetMapping("/page1/{mensaje}")
    public ParamDTO page1(@PathVariable String mensaje) {
        ParamDTO paramDTO = new ParamDTO(mensaje);

        return paramDTO;
    }

    @PostMapping("/solicitud")
    public Users createUser(@RequestBody Users user) {
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("code", code);
        json.put("user", user);
        json.put("message", message);
        json.put("values", values);
        return json;
    }

}
