package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.HomePage;
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

    @When("^I search on top search bar with text (.+)$")
    public void enterSearchText(String title) {


        homePage.enterAutoSearchTerm(title);
    }

    @Then("^I verify (.+) as displayed result$")
    public void verifySearchResult(String response) {

        getDriver().findElement(By.linkText(response)).isDisplayed();

        Assert.assertEquals(response,"Title i will teach you IOS");

    }

}





