package com.resqgrid.backend.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegisterRequest{

    @NotBlank(message= "full name requrires")
    @Size (min=3, max=100, message="full name must be between 3 and 50 characters")
    private String fullName;

    @NotBlank(message= "email is required")
    @Email (message= "enter a valid email")
    @Size (max=150,
    message="email must be less than 150 characters"
    )
    private String email;

    @NotBlank (message= "password is required")
    @Size (min=8, max=100, message="password must be between 8 and` 100 characters")
    private String password;

    public RegisterRequest() {}

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}