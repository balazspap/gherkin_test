Feature: Form page functionality test
  Scenario Outline: On the Form page, if you type <value> the input field and submit the form, you should get redirect to the Hello page, and the following text should appear: <result>
    Given the Form page
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