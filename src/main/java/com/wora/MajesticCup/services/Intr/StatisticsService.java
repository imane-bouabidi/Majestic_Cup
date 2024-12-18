package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Statistics.CreateStatisticsDTO;
import com.wora.MajesticCup.dtos.Statistics.StatisticsDTO;
import com.wora.MajesticCup.dtos.Statistics.UpdateStatisticsDTO;
import com.wora.MajesticCup.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public interface StatisticsService extends GenericService<CreateStatisticsDTO, UpdateStatisticsDTO, StatisticsDTO, Long> {
}
