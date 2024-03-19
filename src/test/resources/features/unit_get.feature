Feature: Get a Unit by id feature

  Background:
    Given Add a new unit with name "Unit 1" and description "My Unit 1"
    And Add a new unit with name "Unit 2" and description "My Unit 2"

  Scenario: Should get a unit by id
    When I get the unit with id 1
    Then receives status code of 200
    And I should get a unit with name "Unit 1" and description "My Unit 1"

  Scenario: Should returns 404 when unit not found
    When I get the unit with id 999
    Then receives status code of 404