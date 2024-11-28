package com.zegasoftware.kaftaconnect.repository;

import com.zegasoftware.kaftaconnect.model.dto.SongDetails;
import com.zegasoftware.kaftaconnect.model.dto.SongSummary;
import com.zegasoftware.kaftaconnect.model.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SongRepo extends JpaRepository<SongEntity, Long> {

    @Query("select new com.zegasoftware.kaftaconnect.model.dto.SongSummary" +
            "(s.title, s.artist ) from SongEntity s")
    List<SongSummary> getAllSongs();

    @Query("select new com.zegasoftware.kaftaconnect.model.dto.SongDetails" +
            "(s.title, s.artist, s.album, s.genre, s.release_date, s.duration) from SongEntity s where s.id=:id")
    Optional<SongDetails> findBySongId(@Param("id") Long id);


}
