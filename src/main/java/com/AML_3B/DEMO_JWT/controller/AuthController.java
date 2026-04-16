package com.AML_3B.DEMO_JWT.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    // 🔐 LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        String username = request.getUsername();
        String password = request.getPassword();

        // ✅ Dummy check (for now)
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        } else {
            return "Invalid Credentials";
        }
    }

    // 🔒 PROTECTED API (to test security)
    @GetMapping("/hello")
    public String hello() {
        return "Hello, you are authenticated!";
    }
}