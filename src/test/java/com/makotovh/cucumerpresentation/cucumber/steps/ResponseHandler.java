package com.makotovh.cucumerpresentation.cucumber.steps;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient.ResponseSpec;

@Component
@RequiredArgsConstructor
public class ResponseHandler {

  private static final String NON_EXISTENT = "non-existent";

  private final ObjectMapper objectMapper;

  public ResponseSpec response;

  public JsonNode getResponseAsJson() {
    var lastResponse = response.expectBody(String.class).returnResult();
    try {
      return objectMapper.readTree(lastResponse.getResponseBodyContent());
    } catch (Exception e) {
      throw new RuntimeException("Error parsing response", e);
    }
  }
}
