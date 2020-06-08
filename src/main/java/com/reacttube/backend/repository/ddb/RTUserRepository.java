package com.reacttube.backend.repository.ddb;

import com.reacttube.backend.entity.RTUserEntity;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface RTUserRepository extends CrudRepository<RTUserEntity, String> {
 RTUserEntity findRTUserEntityByAuthId (String authId);
}
