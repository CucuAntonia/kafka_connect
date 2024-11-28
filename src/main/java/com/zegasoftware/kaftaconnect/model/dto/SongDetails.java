package com.zegasoftware.kaftaconnect.model.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SongDetails {

    private String title;
    private String artist;
    private String album;
    private String genre;
    private LocalDate release_date;
    private Integer duration;
}
