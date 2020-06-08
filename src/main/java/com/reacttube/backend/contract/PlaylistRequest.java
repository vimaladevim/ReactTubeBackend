package com.reacttube.backend.contract;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistRequest {
  @JsonProperty("videoName")
    private String videoName;
  @JsonProperty("videoUrl")
    private String videoUrl;
  @JsonProperty("videoThumbnail")
    private String videoThumbnail;
  @JsonProperty("playlistId")
    private String playlistId;
  @JsonProperty("videoId")
    private String videoId;
    @JsonProperty("userId")
    private String userId;

    public String getVideoId() {
        return videoId;
    }

    public PlaylistRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public PlaylistRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }





    public PlaylistRequest setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
        return this;
    }
    public String getPlaylistId() {
        return playlistId;
    }
    public String getVideoName() {
        return videoName;
    }

    public PlaylistRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public PlaylistRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public PlaylistRequest setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
        return this;
    }


}
