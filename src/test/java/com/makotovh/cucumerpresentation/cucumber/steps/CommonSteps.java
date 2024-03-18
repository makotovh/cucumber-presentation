package com.makotovh.cucumerpresentation.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import io.cucumber.java.en.Then;

public class CommonSteps extends BaseIntegrationTest {

  @Then("^receives status code of (\\d+)$")
  public void receives_status_code_of(int statusCode) {
    assertEquals(statusCode, this.responseHandler.lastResponse.getStatus().value());
  }
}
