package com.reacttube.backend.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "RT_User")
public class RTUserEntity {

    private String name;
    private String emailId;
    private String authId;

    @DynamoDBAttribute(attributeName = "NAME")
    public String getName()
    {
        return name;
    }

    public RTUserEntity setName(String name)
    {
        this.name = name;
        return this;
    }
    @DynamoDBHashKey(attributeName = "AUTH_ID")
    public String getAuthId() {
        return authId;
    }

    public RTUserEntity setAuthId(String authId)
    {
        this.authId = authId;
        return this;
    }
    @DynamoDBAttribute(attributeName = "EMAIL")
    public String getEmailId() {
        return emailId;
    }

    public RTUserEntity setEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }


}
