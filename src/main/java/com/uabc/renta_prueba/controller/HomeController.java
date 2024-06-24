package com.uabc.renta_prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

    @GetMapping()
    public String getMethodName() {
        return "index";
    }

    @GetMapping("/get-hola-mundo")
    public String getHolaMundo() {
        return "Hola mundo";
    }
    
}
