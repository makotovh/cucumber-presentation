package com.makotovh.cucumerpresentation.controller;

import com.makotovh.cucumerpresentation.entity.Section;
import com.makotovh.cucumerpresentation.model.SectionRequest;
import com.makotovh.cucumerpresentation.service.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sections")
public class SectionController {

  private final SectionService sectionService;

  @PostMapping
  @ResponseStatus(org.springframework.http.HttpStatus.CREATED)
  public Mono<Section> saveSection(@RequestBody SectionRequest sectionRequest) {
    return sectionService.saveSection(sectionRequest);
  }
}
