package com.example.webfluxdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api")
public class HomeController {


    @RequestMapping(value = "/index")
    public String getTestData(Model model) {
        model.addAttribute("title", "Tweet API");
        return "index";
    }

}
