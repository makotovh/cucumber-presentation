package com.makotovh.cucumerpresentation.cucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VersionSteps extends BaseIntegrationTest {

  @When("^the client calls /version$")
  public void the_client_calls_version() {
    // Write code here that turns the phrase above into concrete actions
    this.responseHandler.lastResponse = webTestClient.get().uri("/version").exchange().expectBody(String.class).returnResult();
  }

  @Then("^the client receives server version (.+)$")
  public void the_client_receives_version_body(String version) {
    assertEquals(version, this.responseHandler.lastResponse.getResponseBody());
  }
}
