@ionic  @mobile
Feature: Mobile Tutorial Splash Feature


 Scenario: Verify user should be able to slide right on tutorial pages
   Given I am on Splash screen of the ionic conference app
   When I swipe right 3 times on tutorials slides
 # And I tap on the SKIP button
  Then I verify Continue button is displayed


  #Scenario: Verify user should be able to view default main menu bar items
    # Given I am on home page of the app
#    When I click on hamburger menu
#    Then I verify default main menu bar fields
#
#
#  Scenario: Verify user should be able to search for event
# When I Search for "Breakfast"
#    Then I verify Event displayed with header, Duration, description
#
#
 #Scenario: verify reset filter option
  #Given I am on Splash screen of the ionic conference app

   #When I tap on the SKIP button
 #  And I click on filter button
#    And I disable "Angular" option
 #And I click on All Reset Filter button
#    Then I verify all options are enabled
#
