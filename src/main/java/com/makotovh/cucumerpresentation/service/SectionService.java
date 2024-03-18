package com.makotovh.cucumerpresentation.service;

import com.makotovh.cucumerpresentation.entity.Section;
import com.makotovh.cucumerpresentation.model.SectionRequest;
import com.makotovh.cucumerpresentation.repository.SectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class SectionService {
  private final SectionRepository sectionRepository;

  public Mono<Section> saveSection(SectionRequest sectionRequest) {
    return Mono.fromSupplier(
        () ->
            sectionRepository.save(
                Section.builder()
                    .name(sectionRequest.name())
                    .description(sectionRequest.description())
                    .unitId(sectionRequest.unitId())
                    .build()));
  }
}
