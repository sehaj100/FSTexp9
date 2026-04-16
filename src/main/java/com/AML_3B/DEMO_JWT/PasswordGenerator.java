package com.AML_3B.DEMO_JWT;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(String[] args) {

        // Create encoder object
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // Encode password
        String encodedPassword = encoder.encode("admin123");

        // Print encoded password
        System.out.println("Encoded Password: " + encodedPassword);
    }
}