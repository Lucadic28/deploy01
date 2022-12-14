package it.Deploy1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping
    public String getName(){
        String devName = new String("Luca");
        return devName;

    }
}
