package com.reacttube.backend.controllers;

import com.reacttube.backend.contract.PlaylistRequest;
import com.reacttube.backend.contract.PlaylistResponse;
import com.reacttube.backend.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }
    @PostMapping
    public void addPlaylist(@RequestBody PlaylistRequest playlistRequest)
    {
        playlistService.addPlaylist(playlistRequest);
    }
    @GetMapping
    public PlaylistResponse getPlaylist(@RequestParam("Playlist_Id") String playlistId,
                                        @RequestParam("Video_Id") String videoId)
    {
        return playlistService.getPlaylist(playlistId, videoId);
    }
}
