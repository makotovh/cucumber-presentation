package com.makotovh.cucumerpresentation.cucumber.steps;


import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import io.cucumber.java.en.Then;

public class CommonSteps extends BaseIntegrationTest {

  @Then("^receives status code of (\\d+)$")
  public void receives_status_code_of(int statusCode) {
    this.responseHandler.response.expectStatus().isEqualTo(statusCode);
  }
}
