package com.reacttube.backend.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest {
@JsonProperty("name")
    private String name;
@JsonProperty("email")
    private String emailId;
    @JsonProperty("auth_id")
    private String authId;

    public String getName() {
        return name;
    }

    public UserRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmailId() {
        return emailId;
    }

    public UserRequest setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public String getAuthId() {
        return authId;
    }

    public UserRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }


}
