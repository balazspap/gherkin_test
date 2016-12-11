Feature: REQ_UI_03 and REQ_UI_04
  Scenario: When I click on the Home button, I should get navigated to the Home page
    Given I go to UI Testing home page
    When I click the Home button
    Then I get navigated to the Home page
    And Home button is active

#Feature: REQ-UI-12
#  Scenario Outline: On the Form page, if you type <value> the input field and submit the form, you should get redirect to the Hello page, and the following text should appear: <result>
#    Given the Form page
#    When you type <value> into input field
#    And submit the form
#    Then you should get redirected to the Hello Page
#    And <result> should appear
#    Examples:
#      | value   | result         |
#      | John    | Hello John!    |
#      | Sophia  | Hello Sophia!  |
#      | Charlie | Hello Charlie! |
#      | Emily   | Hello Emily!   |
