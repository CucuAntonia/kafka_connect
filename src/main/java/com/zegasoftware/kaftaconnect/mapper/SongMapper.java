package com.zegasoftware.kaftaconnect.mapper;


import com.zegasoftware.kaftaconnect.model.dto.SongDetails;
import com.zegasoftware.kaftaconnect.model.entity.SongEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SongMapper {

    SongEntity toEntity(SongDetails songDetails);
}
