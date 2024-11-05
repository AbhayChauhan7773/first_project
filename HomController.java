package com.example.First_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomController {
    @RequestMapping("/Home")
    public String Home(){
        return "Home";
    }
}
