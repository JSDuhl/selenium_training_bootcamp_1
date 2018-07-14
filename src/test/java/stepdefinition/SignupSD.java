package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.SignupPage;
import org.openqa.selenium.By;
import org.testng.Assert;


import java.util.Random;

import static stepdefinition.SharedSD.getDriver;

public class SignupSD {

    private SignupPage signupPage = new SignupPage();
    private HomePage homePage = new HomePage();

    @Given("^User is on the Registration page$")
    public void iAmOnRegistrationPage() {

        homePage.clickOnJoinButton();
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com/signup" );

    }

    @When("^I enter name as (testuser), email as (email), password as (tester)$")

    public void enterDataIntoTextFields(String name, String email, String password) {
                signupPage.enterUserName(name);
                signupPage.enterRandomEmail(email);
                signupPage.enterPassword(password);

        }

    @And ("^I click on the submit button$")

    public void submitRegistration(){
                signupPage.clickOnSubmitButton();
    }


    @Then("^I am signed-in as a new user$")

    public void verifySignin(){
        //String URL = getDriver().getCurrentUrl();
        //Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com" );
        getDriver().findElement(By.xpath("//a[@role='button']//img[@class='img-circle']")).isDisplayed();


    }

    }



