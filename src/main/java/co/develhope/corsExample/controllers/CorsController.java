package co.develhope.corsExample.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
public class CorsController {

    @GetMapping("")
    @CrossOrigin(origins = "http://localhost:8080")
    public String welcome() {
        return "Hello valid app";
    }
}
