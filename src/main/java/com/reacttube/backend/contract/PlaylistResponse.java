package com.reacttube.backend.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistResponse {
    @JsonProperty
    private String videoName;
    @JsonProperty
    private String playlistId;
    @JsonProperty
    private String videoUrl;
    @JsonProperty
    private String videoThumbnail;
    @JsonProperty
    private String videoId;
    @JsonProperty
    private String userId;

    public String getVideoId() {
        return videoId;
    }

    public PlaylistResponse setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public PlaylistResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public PlaylistResponse setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
        return this;
    }



    public String getVideoName() {
        return videoName;
    }

    public PlaylistResponse setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public PlaylistResponse setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public PlaylistResponse setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
        return this;
    }


}
