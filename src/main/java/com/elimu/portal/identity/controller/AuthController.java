package com.elimu.portal.identity.controller;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/login-info")
    public String loginInfo(@AuthenticationPrincipal OAuth2User principal) {
        if (principal == null) return "Not logged in";

        String name = principal.getAttribute("name");
        String email = principal.getAttribute("email");

        System.out.println("User logged in: " + name + " (" + email + ")");

        return "Hello " + name + ", your email is " + email;
    }
}
