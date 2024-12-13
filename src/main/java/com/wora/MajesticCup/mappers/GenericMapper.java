package com.wora.MajesticCup.mappers;

public interface GenericMapper <CREATE_DTO,UPDATE_DTO,DTO,ENTITY>{
    DTO toDTO(ENTITY entity);
    ENTITY toEntity(DTO dto);
    ENTITY CreateToEntity(CREATE_DTO dto);
    ENTITY UpdateToEntity(UPDATE_DTO updateDto);

}
