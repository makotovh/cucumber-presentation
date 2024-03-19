package com.makotovh.cucumerpresentation.cucumber.steps;

import com.makotovh.cucumerpresentation.cucumber.BaseIntegrationTest;
import com.makotovh.cucumerpresentation.model.SectionRequest;
import com.makotovh.cucumerpresentation.service.UnitService;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class SectionSteps extends BaseIntegrationTest {

  @Autowired private UnitService unitService;

  @When("Add a new section with name {string} and description {string} in the unit {string}")
  public void add_a_new_section_with_name_and_description_in_the_unitId(
      String name, String description, String unitName) {

    var unit = unitService.getUnitByName(unitName).block();
    var request =
        SectionRequest.builder().name(name).description(description).unitId(unit.getId()).build();
    this.responseHandler.response =
        webTestClient.post().uri("/sections").bodyValue(request).exchange();
  }
}
