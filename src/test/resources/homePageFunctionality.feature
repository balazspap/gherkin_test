Feature: Home Page functionality test
  Background:
    Requirements:
      REQ-UI-01: The Title should be "UI Testing Site" on every site (Moderate Priority)
      REQ-UI-02: The Company Logo should be visible on every site (Moderate Priority)
      REQ-UI-09: The following text should be visible on the Home page in <h1> tag: "Welcome to the Docler Holding QA Department" (Low Priority)
      REQ-UI-10: The following text should be visible on the Home page in <p> tag: "This site is dedicated to perform some exercises and demonstrate automated web testing." (Low Priority)

  Scenario: When I click on the Home button, I should get navigated to the Home page and the Page title should be "UI Testing Site", and the company logo with the appropriate texts are visible
    Given The UI Testing Site
    When I navigate to the Home Page
    Then The Title of the page is UI Testing Site
    And The Company Logo Is Visible
    And Welcome Text is visible
    And Exercise test is visible