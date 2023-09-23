package com.jh.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {
    @GetMapping("/")
    public String Hello()
    {
        return "Hello World !";
    }
}
