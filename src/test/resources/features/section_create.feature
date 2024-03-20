Feature: Create Section feature

  Background:
    Given New unit with name "Unit 1" and description "This is a unit"

  Scenario: Should create a new section
    When Add a new section with name "Section 1" and description "This is a section" in the unit "Unit 1"
    Then I receive status code of 201

  Scenario: Should validate section name
    When Add a new section with name "" and description "This is a section" in the unit "Unit 1"
    Then I receive status code of 400

  Scenario: Should validate unit id
    When Add a new section with name "Section 1" and description "This is a section" in the unit "Non-existent"
    Then I receive status code of 400
