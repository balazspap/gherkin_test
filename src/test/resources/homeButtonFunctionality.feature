Feature: Home button functionality test
  Background:
    Requirements:
    REQ-UI-03: When I click on the Home button, I should get navigated to the Home page (High Priority)
    REQ-UI-04: When I click on the Home button, it should turn to active status (Low Priority)

  Scenario: When I click on the Home button, I should get navigated to the Home page and Home button should be active
    Given I go to UI Testing home page
    When I click the Home button
    Then I get navigated to the Home page
    And Home button is active
