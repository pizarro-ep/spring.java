package com.zero.spring.sce_java.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/params")
public class RequestParamControllers {
    @GetMapping("/detail")
    public ParamDTO detail(@RequestParam(required = false, defaultValue = "Hola Mundo") String information) {
        // public ParamDTO detail(@RequestParam String information) {
        ParamDTO paramDTO = new ParamDTO(information);

        return paramDTO;
    }

}
