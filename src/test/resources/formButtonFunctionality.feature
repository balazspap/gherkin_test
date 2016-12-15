Feature: Form button functionality test
  Background:
    Requirements:
    REQ-UI-05: When I click on the Form button, I should get navigated to the Form page (High Priority)
    REQ-UI-06: When I click on the Form button, it should turn to active status (Low Priority)

  Scenario: When I click on the Form button, I should get navigated to the Form page and Form button should be active
    Given I navigate to UI Testing home page
    When I click the Form button
    Then I get navigated to the Form page
    And Form button is active