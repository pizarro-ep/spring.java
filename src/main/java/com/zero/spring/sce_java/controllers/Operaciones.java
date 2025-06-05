package com.zero.spring.sce_java.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/divition")
public class Operaciones {

    @GetMapping()
    /*
     * public String Divide() {
     * int valor = 20 / 0;
     * return "Resultado: " + valor;
     * }
     */
    public String Divide(@RequestParam(name = "num") String numeradorStr,
            @RequestParam(name = "den") String denominadorStr) {
        try {
            int numerador = Integer.parseInt(numeradorStr);
            int denominador = Integer.parseInt(denominadorStr);
            int valor = numerador / denominador;
            return "Resultado: " + valor;
        } catch (ArithmeticException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

}

@RestController
class NullPointerExcepcions {
    @GetMapping("nullvalue")
    public String Nulo() {
        String valorNulo = null;
        valorNulo.length();
        return "Valor nulo";
    }

}
