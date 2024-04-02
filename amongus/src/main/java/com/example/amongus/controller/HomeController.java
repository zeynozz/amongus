package com.example.amongus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToHomepage() {
        return "redirect:/homepage.html";
    }
}
