package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobile_pages.IonicSplash;


public class IonicTutorialSD {

    private IonicSplash ionicSplash = new IonicSplash();




  @Given("^I am on Splash screen of the ionic conference app$")
  public void iamonSplash() throws InterruptedException {
    ionicSplash.confirmTitle();
  }

  @When("^I swipe right (.+) times on tutorials slides$")
  public void swipethroughtutorial(int anything) {
    ionicSplash.swipeRight(anything);
  }

  @Then("^I verify Continue button is displayed$")
  public void iseecontinue() throws InterruptedException {
    ionicSplash.confirmContinue();
  }

    }









