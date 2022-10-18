Feature: Multiple run of the when annotation
  Scenario Outline: test for datatable
    When I type the following names
      | name     | nameID  |
      | "Sneha"  | "name1" |
      | "Rudra"  | "name2" |
      | "Swathi" | "name3" |
      | "Geetha" | "name4" |
    And I click on OK button
    Then I should see some <name>
    Examples:
      | name |
      | Java |