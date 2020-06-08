package com.reacttube.backend.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("emailId")
    private String emailId;

    public String getName() {
        return name;
    }

    public UserResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public UserResponse setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public String getAuthId() {
        return authId;
    }

    public UserResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    @JsonProperty("auth_id")
    private String authId;





}
