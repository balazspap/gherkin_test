Feature: REQ_UI_05 and REQ_UI_06
  Scenario: When I click on the Form button, I should get navigated to the Form page
    Given I navigate to UI Testing home page
    When I click the Form button
    Then I get navigated to the Form page
    And Form button is active