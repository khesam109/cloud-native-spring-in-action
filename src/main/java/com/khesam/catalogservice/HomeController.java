package com.khesam.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController Identifies a class defining handlers for REST/HTTP endpoints
 *
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting() {
        return "salam";
    }
}
