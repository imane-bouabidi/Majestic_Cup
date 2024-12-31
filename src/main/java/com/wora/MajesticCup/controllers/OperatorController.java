package com.wora.MajesticCup.controllers;

import com.wora.MajesticCup.dtos.Result.CreateResultDTO;
import com.wora.MajesticCup.dtos.Result.ResultDTO;
import com.wora.MajesticCup.dtos.Result.UpdateResultDTO;
import com.wora.MajesticCup.services.Intr.ResultService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operator")
@RequiredArgsConstructor
public class OperatorController {


    private final ResultService resultService;

    @PostMapping("/results")
    public ResponseEntity<ResultDTO> createResult(@RequestBody @Valid CreateResultDTO createResultDTO) {
        return ResponseEntity.ok(resultService.save(createResultDTO));
    }

    @GetMapping("/results/{id}")
    public ResponseEntity<ResultDTO> findResultById(@PathVariable String id) {
        return ResponseEntity.ok(resultService.findById(id));
    }

    @PutMapping("/results/{id}")
    public ResponseEntity<ResultDTO> updateResult(
            @RequestBody @Valid UpdateResultDTO updateResultDTO,
            @PathVariable String id
    ) {
        return new ResponseEntity<>(resultService.update(updateResultDTO, id), HttpStatus.OK);
    }

    @DeleteMapping("/results/{id}")
    public ResponseEntity<String> deleteResult(@PathVariable String id) {
        resultService.delete(id);
        return new ResponseEntity<>("RESULT WITH ID: " + id + " DELETED SUCCESSFULLY !!", HttpStatus.OK);
    }
}
