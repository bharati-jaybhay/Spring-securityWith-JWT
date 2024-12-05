package com.jwt_security.security_with_jwt.model;

import lombok.Data;

@Data
public class AuthRequest {

    private String username;

    private String password;
}
