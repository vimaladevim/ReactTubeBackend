package com.reacttube.backend.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.reacttube.backend.entity.keys.RTPlaylistId;
import org.springframework.data.annotation.Id;


@DynamoDBTable(tableName = "RT_Playlist")
public class RTPlaylistEntity {
    @Id
    private RTPlaylistId playlistId;
    private String videoName;
    private String userId;
    private String videoUrl;
    private String videoThumbnail;

    @DynamoDBRangeKey(attributeName = "Video_Id")
    public String getVideoId() {
        return playlistId != null ? playlistId.getVideoId() : null;
    }

    public RTPlaylistEntity setVideoId(String videoId) {
        if (this.playlistId == null)
        {
            this.playlistId = new RTPlaylistId();
        }
        this.playlistId.setVideoId(videoId);
        return this;
    }

    @DynamoDBAttribute(attributeName = "User_Id")
    public String getUserId() {
        return userId;
    }

    public RTPlaylistEntity setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @DynamoDBAttribute(attributeName = "VideoName")
    public String getVideoName() {
        return videoName;
    }

    public RTPlaylistEntity setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    @DynamoDBHashKey(attributeName = "Playlist_Id")
    public String getPlaylistId() {
        return playlistId !=null ? playlistId.getPlaylistId() : null;
    }

    public RTPlaylistEntity setPlaylistId(String playlistId) {
        if (this.playlistId == null)
        {
            this.playlistId = new RTPlaylistId();
        }
        this.playlistId.setPlaylistId(playlistId);
        return this;
    }

    @DynamoDBAttribute(attributeName = "VideoUrl")
    public String getVideoUrl() {
        return videoUrl;
    }

    public RTPlaylistEntity setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    @DynamoDBAttribute(attributeName = "VideoThumbnail")
    public String getVideoThumbnail() {
        return videoThumbnail;
    }

    public RTPlaylistEntity setVideoThumbnail(String videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
        return this;
    }


}
