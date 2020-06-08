package com.reacttube.backend.resource;

import com.reacttube.backend.entity.RTPlaylistEntity;
import com.reacttube.backend.entity.keys.RTPlaylistId;
import com.reacttube.backend.repository.ddb.RTPlaylistRepository;
import org.springframework.stereotype.Component;

@Component
public class PlaylistResource {
    final RTPlaylistRepository rtPlaylistRepository;

    public PlaylistResource(RTPlaylistRepository rtPlaylistRepository) {
        this.rtPlaylistRepository = rtPlaylistRepository;
    }

    public RTPlaylistEntity getPlaylist(String playlistId, String videoId) {
        RTPlaylistId rtPlaylistId = new RTPlaylistId();
        rtPlaylistId.setPlaylistId(playlistId);
        rtPlaylistId.setVideoId(videoId);
        return null;
//        return rtPlaylistRepository.findRTPlaylistEntityByPlaylistId(rtPlaylistId);
    }
    public void addPlaylist(RTPlaylistEntity rtPlaylistEntity)
    {
        rtPlaylistRepository.save(rtPlaylistEntity);
    }
}
