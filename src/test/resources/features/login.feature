  @login @web @regression
  Feature: Login feature

  Background:
    Given User is on the Threely login page

  Scenario: Verify valid Login
    When I enter username as jane@email.com and password as tester
    And I click on submit button
    Then I verify user icon is displayed


