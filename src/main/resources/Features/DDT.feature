Feature: Feature to test login functionality in Swag Labs

  Scenario Outline: Validate login in Swag Labs
    Given browser is launched
    And user is on Swag Labs login page
    When user enters <username>
    And enters <password>
    Then user is navigated to home page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | hello        |
      | problem_user            | hi           |
      | performance_glitch_user | cucumber     |
      | standard_user           | secret_sauce |
