package com.reacttube.backend.mapper;

import com.reacttube.backend.contract.UserRequest;
import com.reacttube.backend.contract.UserResponse;
import com.reacttube.backend.entity.RTUserEntity;

public class UserEntityMapper {
    public static UserResponse generateUserResponseFromRTUserEntity(RTUserEntity userEntity)
    {
        return new UserResponse()
                .setAuthId(userEntity.getAuthId())
                .setEmailId(userEntity.getEmailId())
                .setName(userEntity.getName());
    }
    public static RTUserEntity generateRTUserEntityFromUserRequest(UserRequest userRequest)
    {
        return new RTUserEntity()
                .setAuthId(userRequest.getAuthId())
                .setEmailId(userRequest.getEmailId())
                .setName(userRequest.getName());

    }
}
