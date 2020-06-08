package com.reacttube.backend.repository.ddb;

import com.reacttube.backend.entity.RTPlaylistEntity;
import com.reacttube.backend.entity.keys.RTPlaylistId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface RTPlaylistRepository extends CrudRepository<RTPlaylistEntity, RTPlaylistId> {
 //   RTPlaylistEntity findRTPlaylistEntityByPlaylistId(RTPlaylistId playlistId);

}
