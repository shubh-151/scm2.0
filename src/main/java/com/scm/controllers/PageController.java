package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");
        model.addAttribute("name", "PadtelAnalytics");
        model.addAttribute("Address", "Vimannagar");
        model.addAttribute("GitRepo","https://github.com/shubh-151");
        return "home";
    }


    // About route

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin",false);
        System.out.println("about page loading");
        return "about";
    }

    //Services route
    @RequestMapping("/services")
    public String servicePage(){
        System.out.println("Services page loading");
        return "services";
    }

}
