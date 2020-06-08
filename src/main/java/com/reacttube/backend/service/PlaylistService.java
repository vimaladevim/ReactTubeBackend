package com.reacttube.backend.service;

import com.reacttube.backend.contract.PlaylistRequest;
import com.reacttube.backend.contract.PlaylistResponse;
import com.reacttube.backend.mapper.PlaylistEntityMapper;
import com.reacttube.backend.resource.PlaylistResource;
import org.springframework.stereotype.Service;

import static com.reacttube.backend.mapper.PlaylistEntityMapper.generatePlaylistResponseFromRTPlaylistEntity;
import static com.reacttube.backend.mapper.PlaylistEntityMapper.generateRTPlaylistEntityFromPlaylistRequest;

@Service
public class PlaylistService {

    final PlaylistResource playlistResource;

    public PlaylistService(PlaylistResource playlistResource) {
        this.playlistResource = playlistResource;
    }

    public void addPlaylist(PlaylistRequest playlistRequest)
    {
        playlistResource.addPlaylist(generateRTPlaylistEntityFromPlaylistRequest(playlistRequest));
    }

    public PlaylistResponse getPlaylist(String playlistId, String videoId) {
        return generatePlaylistResponseFromRTPlaylistEntity(playlistResource.getPlaylist(playlistId, videoId));
    }
}
