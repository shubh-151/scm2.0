package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    //Home route
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

    //contact page
    @RequestMapping("/contact")
    public String contactPage(){
        System.out.println("Contact page");
        return "contact";
    }

    //Loginpage
    @RequestMapping("/login")
    public String loginPage(){
        System.out.println("Login page");
        return "login";
    }

    //Register Page
    @RequestMapping("/register")
    public String register(Model model){
        UserForm userForm = new UserForm();
        model.addAttribute("user", userForm)
        System.out.println("Register page");
        return "Register";
    }

    //processing register
    @RequestMapping(value="/do-register",method = RequestMethod.POST)
    public String processRegister(){
        System.out.println("registration process");
        // fetch from data
        //validate from data
        //save to database
        //message ="registration sucessfull"
        //redirect to login page
        return "redirect:/register";
    }

}
