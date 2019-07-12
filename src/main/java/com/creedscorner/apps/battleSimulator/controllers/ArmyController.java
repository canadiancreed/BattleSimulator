package com.creedscorner.apps.battleSimulator.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/armies")
@CrossOrigin(origins = "http://localhost:4200")
@Api(value="onlinestore", description="Operations pertaining to battle configuration and execution")
public class ArmyController {
}
