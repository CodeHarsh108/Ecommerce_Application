package com.ecommerce.project.security.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    @NotBlank
    @Max(value = 10, message = "Name can be maximum 10 characters long")
    @Min(value = 3, message = "Name must be minimum 3 characters long")
    private String username;

    @NotBlank
    @Email
    private String email;


    private Set<String> role;

    @NotBlank
    @Min(value = 8, message = "Password should be atleast 8 characters long")
    @Max(value = 20, message = "Password can be atmax 20 characters long")
    private String password;

}
