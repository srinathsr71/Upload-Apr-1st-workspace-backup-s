Feature: Validatimg petstore APIs
  Scenario: Add a new pet to the store
    Given User has API body for adding a pet
    And I pass request body as content type
    When User calls create a resource API
    Then user validates response code
    