package com.makotovh.cucumerpresentation.model;

import lombok.Builder;

@Builder
public record SectionRequest(String name, String description, Long unitId) {}
