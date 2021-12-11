package com.example.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
}
