package com.zaxx.market.domain.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationResponse {
    private String jwt;
    public AuthenticationResponse(String jwt){
        this.jwt=jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
