@date @web

Feature:  Find Today's Date


  Given  i am on Darksky Home page


Scenario: Verify Time Machine Calendar
 When I clicked on Time Machine button
  Then I verify date is selected to today's date


 Scenario: Verify individual day temp timeline
  When I expand todays timeline
  Then I verify lowest and highest temp is displayed correctly


    Scenario: Verify timeline is displayed in correct format
    Then I verify timeline is displayed with two hours incremented
