Feature: User searches for a destination

  @ValidCase @SomeTags
  Scenario: User searches for a destination
    Given User types 'India' in search
    When the options are displayed
    And user clicks more info on first option
    Then the telephone number
    And price
    And days are dsiplayed
