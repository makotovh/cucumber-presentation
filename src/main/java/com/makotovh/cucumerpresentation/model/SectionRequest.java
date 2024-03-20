package com.makotovh.cucumerpresentation.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record SectionRequest(@NotBlank String name, String description, Long unitId) {}
