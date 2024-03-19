package com.makotovh.cucumerpresentation.controller;

import static org.springframework.http.HttpStatus.CREATED;

import com.makotovh.cucumerpresentation.entity.Unit;
import com.makotovh.cucumerpresentation.model.UnitRequest;
import com.makotovh.cucumerpresentation.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/units")
@RequiredArgsConstructor
public class UnitController {

  private final UnitService unitService;

  @PostMapping
  @ResponseStatus(CREATED)
  public Mono<Unit> saveUnit(@RequestBody UnitRequest unitRequest) {
    return unitService.saveUnit(unitRequest);
  }

  @GetMapping("/{unitId}")
  public Mono<Unit> getUnitById(@PathVariable Long unitId) {
    return unitService.getUnitById(unitId);
  }
}
