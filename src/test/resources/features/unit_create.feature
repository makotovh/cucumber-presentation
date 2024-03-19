Feature: Create unit feature

  Scenario: Should create a new unit
    When Add a new unit with name "Unit 1" and description "Very big unit"
    Then receives status code of 201