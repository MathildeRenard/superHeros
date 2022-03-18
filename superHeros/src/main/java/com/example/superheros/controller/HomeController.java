package com.example.superheros.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String getHome(Model model) {

        return "home";
    }


}