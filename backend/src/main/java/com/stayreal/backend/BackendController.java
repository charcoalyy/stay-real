package com.stayreal.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BackendController {

    @GetMapping("/test")
    public String test() {
        return "It works";
    }
}
