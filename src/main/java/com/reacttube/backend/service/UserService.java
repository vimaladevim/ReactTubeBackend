package com.reacttube.backend.service;


import com.reacttube.backend.contract.UserRequest;
import com.reacttube.backend.contract.UserResponse;
import com.reacttube.backend.entity.RTUserEntity;
import com.reacttube.backend.resource.UserResource;
import org.springframework.stereotype.Service;

import static com.reacttube.backend.mapper.UserEntityMapper.generateRTUserEntityFromUserRequest;
import static com.reacttube.backend.mapper.UserEntityMapper.generateUserResponseFromRTUserEntity;

@Service
public class UserService {
    final UserResource userResource;

    public UserService(UserResource userResource) {
        this.userResource = userResource;
    }

    public UserResponse getUser(String authId){
        return generateUserResponseFromRTUserEntity(userResource.getUser(authId));
    }

    public void addUser(UserRequest userRequest) {
        userResource.addUser(generateRTUserEntityFromUserRequest(userRequest));
    }
}
