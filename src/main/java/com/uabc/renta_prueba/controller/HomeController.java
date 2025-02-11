package com.uabc.renta_prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping()
    public String getMethodName() {
        return "index";
    }

    // Comentario
    @GetMapping("/get-hola-mundo")
    public String getHolaMundo() {
        System.out.println("Hola mundo");
        return "Hola mundo";
    }

}
