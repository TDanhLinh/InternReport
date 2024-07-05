package com.example.testhttp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Annotation for HomeController class serves the role of a controller
@Controller
// This class is used to handle GET request in http1 and http2
public class HomeController {
    @GetMapping("/http1")
    public String http1() {
        return "http1";
    }

    @GetMapping("http2")
    public String http2() {
        return "http2";
    }
}