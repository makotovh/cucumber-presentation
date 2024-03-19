package com.makotovh.cucumerpresentation.cucumber.steps;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import com.makotovh.cucumerpresentation.model.UnitRequest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UnitSteps extends BaseIntegrationTest {

  @When("Add a new unit with name {string} and description {string}")
  public void add_a_new_unit_with_name_and_description(String name, String description) {
    // Write code here that turns the phrase above into concrete actions
    var unitRequest = UnitRequest.builder().name(name).description(description).build();
    this.responseHandler.response =
        webTestClient.post().uri("/units").bodyValue(unitRequest).exchange();
  }

  @When("I get the unit with id {long}")
  public void i_get_the_unit_with_id(Long id) {
    this.responseHandler.response = webTestClient.get().uri("/units/" + id).exchange();
  }

  @Then("I should get a unit with name {string} and description {string}")
  public void i_should_get_a_unit_with_name_and_description(String name, String description) {
    // Write code here that turns the phrase above into concrete actions
    this.responseHandler
        .response
        .expectBody()
        .jsonPath("$.name")
        .isEqualTo(name)
        .jsonPath("$.description")
        .isEqualTo(description);
  }
}
