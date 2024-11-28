package com.zegasoftware.kaftaconnect.service;

import com.zegasoftware.kaftaconnect.model.dto.SongDetails;
import com.zegasoftware.kaftaconnect.model.dto.SongSummary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface SongService {

    List<SongSummary> getAllSongs();

    Optional<SongDetails> getById(Long id);

    boolean saveSong(SongDetails song);

    boolean deleteSong(Long id);

}
