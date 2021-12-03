package com.bencezsiros.first;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplicationController {

    @RequestMapping("/")
    public String hello() {
            return "Szeretlek Klári!";
    }
}
