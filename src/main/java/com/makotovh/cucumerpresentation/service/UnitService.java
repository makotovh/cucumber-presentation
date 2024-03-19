package com.makotovh.cucumerpresentation.service;

import com.makotovh.cucumerpresentation.entity.Unit;
import com.makotovh.cucumerpresentation.model.UnitRequest;
import com.makotovh.cucumerpresentation.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UnitService {

  private final UnitRepository unitRepository;

  public Mono<Unit> saveUnit(UnitRequest unitRequest) {
    return Mono.fromSupplier(
        () ->
            unitRepository.save(
                Unit.builder()
                    .name(unitRequest.name())
                    .description(unitRequest.description())
                    .build()));
  }

  public Mono<Unit> getUnit(Long id) {
    return Mono.fromSupplier(() -> unitRepository.findById(id)).flatMap(Mono::justOrEmpty);
  }

  public Mono<Unit> getUnitByName(String name) {
    return Mono.fromSupplier(() -> unitRepository.findByName(name)).flatMap(Mono::justOrEmpty);
  }

  public Mono<Unit> getUnitById(Long unitId) {
    return Mono.fromSupplier(() -> unitRepository.findById(unitId)).flatMap(Mono::justOrEmpty);
  }
}
