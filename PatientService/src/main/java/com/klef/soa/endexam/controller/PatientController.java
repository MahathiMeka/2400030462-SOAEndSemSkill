package com.klef.soa.endexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @GetMapping("/patient")
    public String getPatient() {
        return "Welcome to Patient Service!";
    }
}

