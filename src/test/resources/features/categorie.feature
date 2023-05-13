Feature: Application categorie

  Scenario: Register a new categorie
    Given I have an categorie payload
    When I POST it to the /categories endpoint
    Then I receive a 201 status code