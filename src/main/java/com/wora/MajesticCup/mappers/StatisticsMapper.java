package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Statistics.CreateStatisticsDTO;
import com.wora.MajesticCup.dtos.Statistics.StatisticsDTO;
import com.wora.MajesticCup.dtos.Statistics.UpdateStatisticsDTO;
import com.wora.MajesticCup.entities.Statistic;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatisticsMapper {
    StatisticsDTO toDTO(Statistic entity);
    Statistic toEntity(StatisticsDTO dto);
    Statistic toEntity(CreateStatisticsDTO dto);
    Statistic toEntity(UpdateStatisticsDTO updateDto);
}
