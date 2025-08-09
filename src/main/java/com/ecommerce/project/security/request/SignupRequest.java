package com.ecommerce.project.security.request;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 10, message = "Name must be between 3 and 10 characters long")
    private String username;


    @NotBlank
    @Email
    private String email;


    private Set<String> role;

    @NotBlank
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters long")
    private String password;

}
