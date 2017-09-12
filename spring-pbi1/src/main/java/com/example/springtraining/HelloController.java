package com.example.springtraining;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap) {
    	modelMap.addAttribute("message", "Hello is it me you looking for");
        return "hello";
    }
    
    @RequestMapping("/hello2")
    @ResponseBody
    public String hello(@RequestParam String message) {
        return "hello "+ message ;
    }
    
    
}