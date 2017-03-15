package com.spring.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class SignupController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "Spring Test Success !!";  
        return new ModelAndView("hellopage", "message", message);  
    }  
    
    @RequestMapping(value="/signup" ,method = RequestMethod.GET)
    public String viewRegistration(Map<String, Object> model) {
        SignupUser signupForm = new SignupUser();    
        model.put("signupForm", signupForm);
         
        List<String> roleList = new ArrayList<>();
        roleList.add("Guest");
        roleList.add("Admin");
        model.put("roleList", roleList);
         
        return "Signup";
    }
     
    @RequestMapping(value="/signup" , method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("signupForm") SignupUser user,
            Map<String, Object> model) {
         
        return "SignupSuccess";
    }
    
}  