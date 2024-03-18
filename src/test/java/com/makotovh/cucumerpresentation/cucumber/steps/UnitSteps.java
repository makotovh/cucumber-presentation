package com.makotovh.cucumerpresentation.cucumber.steps;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import com.makotovh.cucumerpresentation.model.UnitRequest;
import io.cucumber.java.en.When;
import org.springframework.web.reactive.function.BodyInserters;

public class UnitSteps extends BaseIntegrationTest {

  @When("Add a new unit with name {string} and description {string}")
  public void add_a_new_unit_with_name_and_description(String name, String description) {
    // Write code here that turns the phrase above into concrete actions
    var unitRequest = UnitRequest.builder().name(name).description(description).build();
    this.responseHandler.lastResponse =
        webTestClient
            .post()
            .uri("/units")
            .bodyValue(unitRequest)
            .exchange()
            .expectBody(String.class)
            .returnResult();
  }
}
