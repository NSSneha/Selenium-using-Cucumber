Feature: Feature to test login functionality of Orange Hrm
  Scenario Outline: Validate login of Orange Hrm
    Given chrome browser is launched
    And end user is on Orange Hrm login page
    When end user inputs <username>
    And user inputs <password>
    Then end user is navigated to homepage
    Examples:
      | username | password |
      | Admin    | admin123 |
      | locked   | hi       |
      | user     | hello    |
      | Admin    | admin123 |