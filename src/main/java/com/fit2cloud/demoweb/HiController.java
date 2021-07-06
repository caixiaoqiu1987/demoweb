package com.fit2cloud.demoweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("success");
        return "Hello World";
    }
}
