package com.wora.MajesticCup.mappers;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.entities.Result;

public interface ResultMapper extends GenericMapper<CreateResultDTO, UpdateResultDTO,ResultMapper, Result> {
}
