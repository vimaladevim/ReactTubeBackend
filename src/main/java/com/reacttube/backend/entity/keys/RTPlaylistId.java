package com.reacttube.backend.entity.keys;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.reacttube.backend.entity.RTPlaylistEntity;

import java.io.Serializable;

public class RTPlaylistId implements Serializable {

    private String videoId;
    private String playlistId;

    @DynamoDBRangeKey(attributeName = "Video_Id")
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;

    }
    @DynamoDBHashKey(attributeName = "Playlist_Id")
    public String getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;

    }

}
