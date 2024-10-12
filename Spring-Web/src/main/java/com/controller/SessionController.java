package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {
    
    @GetMapping("/Signup")
    public String signup() {
        return "Signup";
    }
    
    @GetMapping("/Login")
    public String login() {
        return "Login";
    }
    
    @PostMapping("/saveuser")
    	public String saveuser(UserBean user) {
    		System.out.println(user.getFirstname());
    		return "Login";
    	}
    	
    

}
