package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.IonicHome;
import framework.mobile_pages.IonicSplash;
import org.openqa.selenium.By;
import org.testng.Assert;

import static stepdefinition.SharedSD.getDriver;

public class IonicHomeSD {

    private IonicHome ionicHome = new IonicHome();
    private IonicSplash ionicSplash = new IonicSplash();




   @Given("^I am on home page of the app$")
    public void iAmOnHome(int anything) throws InterruptedException {
        ionicSplash.confirmTitle();
        ionicSplash.swipeRight(anything);
        ionicHome.confirmSchedule();
    }

    @When("^I click on hamburger menu$")
    public void clickOnHamburger(){
        ionicHome.tapOnHamburgerMenu();
    }

  @Then("^I verify default main menu bar fields$")
    public void verifyMenu(){
        ionicHome.confirmMenuFields();
  }


  //Verify user should be able to search for event
    @When("^I Search for \"([^\"]*)\"$")
    public void enterSearchTerm(String text){
        ionicHome.enterSearchTerm(text);
    }


    @Then("^I verify Event displayed with header, Duration, description$")
    public void verifySearchResult(String response){

        //findElement.(By.linkText(response)).isDisplayed();

        Assert.assertEquals(response, "Breakfast 8:00 am — 9:00 am: Main hallway ");
    }




    @When("^I click on filter button")
    public void tapOnFilter(){ionicHome.tapOnFilterMenu();}


   // @When("^I disable \"([^\"]*)\" option$")
    //left swipe goes here

    @When("^I click on All Reset Filter button$")
    public void resetFilter(){
        ionicHome.tapOnReset();
    }

  //  @Then("^I verify all options are enabled$")



}
