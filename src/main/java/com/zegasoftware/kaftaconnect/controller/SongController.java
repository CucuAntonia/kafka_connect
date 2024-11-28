package com.zegasoftware.kaftaconnect.controller;

import com.zegasoftware.kaftaconnect.model.dto.SongDetails;
import com.zegasoftware.kaftaconnect.model.dto.SongSummary;
import com.zegasoftware.kaftaconnect.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/songs")
    public ResponseEntity<List<SongSummary>> getAllSongs() {
        List<SongSummary> songs = songService.getAllSongs();
        return ResponseEntity.ok(songs);
    }

    @GetMapping("/songs/{id}")
    public ResponseEntity<SongDetails> getSongById(@PathVariable Long id) {
        return songService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/songs")
    public ResponseEntity<Boolean> addSongs(@RequestBody SongDetails song) {
        return songService.saveSong(song) ? ResponseEntity.status(HttpStatus.CREATED).build() : ResponseEntity.badRequest().build();
    }

}
