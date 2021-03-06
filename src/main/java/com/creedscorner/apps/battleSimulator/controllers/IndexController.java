package com.creedscorner.apps.battleSimulator.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class IndexController {

    @RequestMapping(method= RequestMethod.GET)
    String index(){
        return "index";
    }
}
