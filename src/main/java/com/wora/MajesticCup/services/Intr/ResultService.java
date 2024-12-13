package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.entities.Result;
import com.wora.MajesticCup.mappers.ResultMapper;
import com.wora.MajesticCup.services.GenericService;

public interface ResultService extends GenericService <CreateResultDTO, UpdateResultDTO, ResultMapper, Result>{
}
