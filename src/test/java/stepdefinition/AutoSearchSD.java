package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import static stepdefinition.SharedSD.getDriver;

public class AutoSearchSD {

    private HomePage homePage = new HomePage();

    @Given("^i am on the home page$")
    public void iAmOnHomePage() {
       Assert.assertEquals(getDriver().getTitle(), "Threely Starter Template", "Invalid Home Page");

    }


    //search on top left of site is autocomplete search
    // search for term "ios" and see the 1 response "Title: I will teach you IOS"

    @When("^I search on top search bar with text ios$")
    public void enterSearchText(){

           homePage.enterAutoSearchTerm("ios");
        }

    @Then("^I verify Title: I will teach you IOS as displayed result$")
    public void verifySearchResult(){
        getDriver().findElement(By.linkText("Title: I will teach you IOS")).isDisplayed();
        System.out.println("Search for ios Shows correct result");

    }








    }


