Feature: The following requirements are given for http://uitest.duodecadits.com website:
  Requirements:
  REQ-UI-01: The Title should be "UI Testing Site" on every site (Moderate Priority)
  REQ-UI-02: The Company Logo should be visible on every site (Moderate Priority)
  REQ-UI-03: When I click on the Home button, I should get navigated to the Home page (High Priority)
  REQ-UI-04: When I click on the Home button, it should turn to active status (Low Priority)
  REQ-UI-05: When I click on the Form button, I should get navigated to the Form page (High Priority)
  REQ-UI-06: When I click on the Form button, it should turn to active status (Low Priority)
  REQ-UI-07: When I click on the Error button, I should get a 404 HTTP response code (High Priority)
  REQ-UI-08: When I click on the Logo, I should get navigated to the Home page (High Priority)
  REQ-UI-09: The following text should be visible on the Home page in <h1> tag: "Welcome to the Docler Holding QA Department" (Low Priority)
  REQ-UI-10: The following text should be visible on the Home page in <p> tag: "This site is dedicated to perform some exercises and demonstrate automated web testing." (Low Priority)
  REQ-UI-11: On the Form page, a form should be visible with one input box and one submit button (High Priority)
  REQ-UI-12: On the Form page, if you type <value> the input field and submit the form, you should get redirect to the Hello page, and the following text should appear: <result> (High Priority)

  Background:
    Given the UI Testing Site is available
    Scenario: REQ-UI-01, REQ-UI-02, REQ-UI-09, REQ-UI-10
      When I navigate to the Home Page
      Then The Title of the page is UI Testing Site
      And The Company Logo Is Visible
      And Welcome Text is visible
      And Exercise test is visible

    Scenario: REQ-UI-03, REQ-UI-04
      When I click the Home button
      Then I get navigated to the Home page
      And Home button is active

    Scenario Outline: REQ-UI-12
      When you type <value> into input field
      And submit the form
      Then you should get redirected to the Hello Page
      And <result> should appear
      Examples:
        | value   | result         |
        | John    | Hello John!    |
        | Sophia  | Hello Sophia!  |
        | Charlie | Hello Charlie! |
        | Emily   | Hello Emily!   |

    Scenario: REQ-UI-05, REQ-UI-06
      When I click the Form button
      Then I get navigated to the Form page
      And Form button is active

    Scenario: REQ-UI-08
      When I click the Logo button
      Then I get directed to the Home page