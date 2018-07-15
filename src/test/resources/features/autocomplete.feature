@search @web
Feature:  Search

  Background:
    Given i am on the home page

  Scenario: Verify Search Autocomplete
    When I search on top search bar with text ios
    Then I verify Title: I will teach you IOS as displayed result