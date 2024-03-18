Feature: Section feature

  Scenario: Section scenario
    Given Add a new unit with name "Unit 2" and description "This is a unit"
    When Add a new section with name "Section 2" and description "This is a section" in the unit "Unit 2"
    Then receives status code of 201