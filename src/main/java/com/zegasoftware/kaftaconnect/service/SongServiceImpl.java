package com.zegasoftware.kaftaconnect.service;

import com.zegasoftware.kaftaconnect.mapper.SongMapper;
import com.zegasoftware.kaftaconnect.model.dto.SongDetails;
import com.zegasoftware.kaftaconnect.model.dto.SongSummary;
import com.zegasoftware.kaftaconnect.repository.SongRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepo songRepo;

    private final SongMapper mapper;

    public SongServiceImpl(SongRepo songRepo, SongMapper mapper) {
        this.songRepo = songRepo;
        this.mapper = mapper;
    }

    @Override
    public List<SongSummary> getAllSongs() {
        return songRepo.getAllSongs();
    }

    @Override
    public Optional<SongDetails> getById(Long id) {
        return songRepo.findBySongId(id);
    }

    @Override
    public boolean saveSong(SongDetails song) {
        if (song == null) {
            return false;
        }
        songRepo.save(mapper.toEntity(song));
        return true;
    }

    @Override
    public boolean deleteSong(Long id) {
        return false;
    }
}
