package com.booy.booywebsite.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooyController {

    @GetMapping("/")
    public String home() {
        return "common/home";
    }

    @GetMapping("/blooming")
    public String blooming() {
        return "template/blooming";
    }

    @GetMapping("/genderless")
    public String genderless() {
        return "template/genderless";
    }

    @GetMapping("/creepyHouse")
    public String creepyHouse() {
        return "template/creepyHouse";
    }

    @GetMapping("/rudeBoy")
    public String fuckingRude() {
        return "template/rudeBoy";
    }

    @GetMapping("/sunrise")
    public String sunrise() {
        return "template/sunrise";
    }

}
