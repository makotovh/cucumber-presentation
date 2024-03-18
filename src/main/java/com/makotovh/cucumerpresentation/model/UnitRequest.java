package com.makotovh.cucumerpresentation.model;

import lombok.Builder;

@Builder
public record UnitRequest(String name, String description) {
}