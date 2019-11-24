package com.endava.qmanager.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
@Slf4j

public class AdminController {

    @GetMapping
    public String adminPage() {
        return "admin";
    }



    /*@GetMapping(value = "/login")
    public String login() {
        log.info("User should enter credentials");
        return "login";
    }*/

}
