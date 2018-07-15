@registration @web

Feature: Invalid Registration

  Background:
  Given I am on Registration page

  Scenario Outline: Verify invalid email on registration
    When I enter name as testuser, email as <email> and password as tester
    And I click submit button
    Then  I verify invalid email address


    Examples:
    | email                  |
    | test.com               |
    | @gmail.com             |
    | test2gmail.com         |
    | tester @yahoo.com      |
    | test123/july@gmail.com |





