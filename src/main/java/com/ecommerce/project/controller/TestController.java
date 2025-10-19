package com.ecommerce.project.controller;

import com.ecommerce.project.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private JwtUtils jwtUtils;

    @GetMapping("/validate-token")
    public ResponseEntity<?> validateToken(@RequestHeader(value = "Authorization") String authHeader) {
        Map<String, Object> response = new HashMap<>();

        try {
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                String token = authHeader.substring(7);
                boolean isValid = jwtUtils.validateJwtToken(token);

                response.put("token", token);
                response.put("valid", isValid);

                if (isValid) {
                    response.put("username", jwtUtils.getUserNameFromJwtToken(token));
                    response.put("issuedAt", "valid");
                    response.put("expiresAt", "valid");
                } else {
                    response.put("error", "Token validation failed");
                }
            } else {
                response.put("error", "No Bearer token provided");
            }
        } catch (Exception e) {
            response.put("error", "Exception: " + e.getMessage());
        }

        return ResponseEntity.ok(response);
    }
}