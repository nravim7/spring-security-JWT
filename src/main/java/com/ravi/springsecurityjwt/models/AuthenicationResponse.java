package com.ravi.springsecurityjwt.models;

public class AuthenicationResponse {
    private String jwt;

    public AuthenicationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
