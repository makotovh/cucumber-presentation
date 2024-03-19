Feature: Create Section feature

  Background:
    Given Add a new unit with name "Unit 1" and description "This is a unit"

  Scenario: Section scenario
    When Add a new section with name "Section 1" and description "This is a section" in the unit "Unit 1"
    Then receives status code of 201

  Scenario: Section scenario
    When Add a new section with name "" and description "This is a section" in the unit "Unit 1"
    Then receives status code of 400