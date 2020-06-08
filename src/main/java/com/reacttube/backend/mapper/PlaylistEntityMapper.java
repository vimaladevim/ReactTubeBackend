package com.reacttube.backend.mapper;

import com.reacttube.backend.contract.PlaylistRequest;
import com.reacttube.backend.contract.PlaylistResponse;
import com.reacttube.backend.entity.RTPlaylistEntity;

public class PlaylistEntityMapper {
    public static PlaylistResponse generatePlaylistResponseFromRTPlaylistEntity(RTPlaylistEntity rtPlaylistEntity)
    {
        return new PlaylistResponse()
                .setPlaylistId(rtPlaylistEntity.getPlaylistId())
                .setVideoId(rtPlaylistEntity.getVideoId())
                .setUserId(rtPlaylistEntity.getUserId())
                .setVideoName(rtPlaylistEntity.getVideoName())
                .setVideoUrl(rtPlaylistEntity.getVideoUrl())
                .setVideoThumbnail(rtPlaylistEntity.getVideoThumbnail());

    }
    public static RTPlaylistEntity generateRTPlaylistEntityFromPlaylistRequest(PlaylistRequest playlistRequest)
    {
        return new RTPlaylistEntity()
                .setPlaylistId(playlistRequest.getPlaylistId())
                .setVideoId(playlistRequest.getVideoId())
                .setUserId(playlistRequest.getUserId())
                .setVideoName(playlistRequest.getVideoName())
                .setVideoUrl(playlistRequest.getVideoUrl())
                .setVideoThumbnail(playlistRequest.getVideoThumbnail());

    }
}
