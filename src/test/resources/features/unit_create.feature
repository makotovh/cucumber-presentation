Feature: Create unit feature

  Scenario: Should create a new unit
    When New unit with name "Unit 1" and description "Very big unit"
    Then I receive status code of 201
    And I should get a unit with name "Unit 1" and description "Very big unit"