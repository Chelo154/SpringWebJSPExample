package com.springwebjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping("/hello-world")
    public ModelAndView helloWorld(Model model){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello-world");
        return modelAndView;
    }
}
