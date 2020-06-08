package com.reacttube.backend.resource;

import com.reacttube.backend.contract.UserRequest;
import com.reacttube.backend.entity.RTUserEntity;
import com.reacttube.backend.repository.ddb.RTUserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserResource {
    final RTUserRepository rtUserRepository;

    public UserResource(RTUserRepository rtUserRepository) {
        this.rtUserRepository = rtUserRepository;
    }
    public RTUserEntity getUser(String authId)
    {
        return rtUserRepository.findRTUserEntityByAuthId(authId);
    }
    public void addUser(RTUserEntity rtUserEntity)
    {
        rtUserRepository.save(rtUserEntity);
    }
}
