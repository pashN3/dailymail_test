Feature: Book online
  The user books the standard room

  @tag1
  Scenario: User books the standard room
    Given User clicks on book online
    And first available option is selected
    And I click continue
    When I complete the form
    And I click continue
    And Booking details are displayed
    Then the payemnt amount is as expected