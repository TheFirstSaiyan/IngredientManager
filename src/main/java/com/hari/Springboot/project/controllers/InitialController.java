package com.hari.Springboot.project.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitialController {

    @GetMapping(value = "/")
    public String initialMethod()
    {
        return "You got thisssss!";
    }
}
