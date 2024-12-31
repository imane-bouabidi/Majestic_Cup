package com.wora.MajesticCup.services.Intr;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.ResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.services.GenericService;
import org.springframework.stereotype.Service;

@Service
public interface ResultService extends GenericService <CreateResultDTO, UpdateResultDTO, ResultDTO, String>{
    ResultDTO findById(String id);
}
