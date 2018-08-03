package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.HomePage;
import framework.web_pages.SignupPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;
import static stepdefinition.SharedSD.getDriver;

//jill duhl July 2018

public class SignupSD {

    private SignupPage signupPage = new SignupPage();
    private HomePage homePage = new HomePage();

    @Given("^User is on the Registration page$")
    public void iAmOnRegistrationPage() {

        homePage.clickOnJoinButton();
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com/signup");

    }

    @When("^I enter name as (testuser), email as (email), password as (tester)$")
    public void enterDataIntoTextFields(String name, String email, String password) {
        signupPage.enterUserName(name);
        signupPage.enterRandomGmail(email);
        signupPage.enterPassword(password);

    }

    @And("^I click on the submit button$")
    public void submitRegistration() {
        signupPage.clickOnSubmitButton();
    }


    @Then("^I am signed-in as a new user$")

    public void verifySignin() {
       try {
           homePage.findLogoutLink();
           System.out.println("user is logged in");
       } catch(NoSuchElementException a){
           System.out.println("User is not logged in");
       }
    }




}



