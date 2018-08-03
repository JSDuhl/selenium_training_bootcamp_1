package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.DarkSkyHome;

import org.testng.Assert;


public class DarkSkySD {

     DarkSkyHome homePageDarkSky = new DarkSkyHome();

    @Given("^i am on Darksky Home page$")
    public void iAmOnDarkSkyHomePage() {
        Assert.assertEquals(homePageDarkSky.timeMachineTextLine(),"Explore the weather in the past or future:", "THIS IS NOT HOMEPAGE");
    }



  @When("^I clicked on Time Machine button$$")
    public void clickOnTMButton() {
        homePageDarkSky.clickOnTimeMachine();
    }


    @Then("^I verify date is selected to today's date$")

    public void verifyDateSelected() {
       homePageDarkSky.confirmTodaysDate();
        }

    @When("^I expand todays timeline$")
    public void clickOnToday()   {homePageDarkSky.clickOnTodayInfo();}


   @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyTemperatures()  {
        homePageDarkSky.compareMin();
        homePageDarkSky.compareMax();
    }



    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimeline(){

       homePageDarkSky.twoHourImplement();


    }


    }








