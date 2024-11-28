package com.zegasoftware.kaftaconnect.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "songs")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)

public class SongEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String artist;

    @Column()
    private String album;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private LocalDate release_date;

    @Column()
    private Integer duration;

    @Column(nullable = false, name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
