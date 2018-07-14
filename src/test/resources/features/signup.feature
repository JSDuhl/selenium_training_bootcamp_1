@signup @web
Feature:  Sign up

  Background:
    Given User is on the Registration page

  Scenario: Verify a new user can register with a valid email address
    When I enter name as testuser, email as email, password as tester
    And I click on the submit button
    Then  I am signed-in as a new user

