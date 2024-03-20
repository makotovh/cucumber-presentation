package com.makotovh.cucumerpresentation.cucumber.steps;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import com.makotovh.cucumerpresentation.entity.Unit;
import com.makotovh.cucumerpresentation.model.UnitRequest;
import com.makotovh.cucumerpresentation.repository.UnitRepository;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class UnitSteps extends BaseIntegrationTest {

  @Autowired private UnitRepository unitRepository;

  @When("New unit with name {string} and description {string}")
  public void add_a_new_unit_with_name_and_description(String name, String description) {
    var unitRequest = UnitRequest.builder().name(name).description(description).build();
    this.responseHandler.response =
        webTestClient.post().uri("/units").bodyValue(unitRequest).exchange();
  }

  @When("I get the unit with name {string} by id")
  public void i_get_the_unit_with_name(String name) {
    var unitId = unitRepository.findByName(name).map(Unit::getId).orElse(-999L);
    this.responseHandler.response = webTestClient.get().uri("/units/" + unitId).exchange();
  }

  @Then("I should get a unit with name {string} and description {string}")
  public void i_should_get_a_unit_with_name_and_description(String name, String description) {
    this.responseHandler
        .response
        .expectBody()
        .jsonPath("$.name")
        .isEqualTo(name)
        .jsonPath("$.description")
        .isEqualTo(description);
  }
}
