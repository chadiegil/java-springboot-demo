package com.example.restAPI.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustumerController {
    @GetMapping("/greet")
    public String greetCustomer(){
        return "Hello Customer";
    }
    @GetMapping
    public String home(){
        return "Home";
    }
}
