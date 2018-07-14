package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;
import framework.SignupPage;
import org.testng.Assert;


import static stepdefinition.SharedSD.getDriver;

public class InvalidRegSD {

    private HomePage homePage = new HomePage();
    private SignupPage signupPage = new SignupPage();

  @Given("^I am on Registration page$")

    public void iAmOnRegistrationPage() {

        homePage.clickOnJoinButton();
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com/signup");

    }

   @When("^I enter name as (.+), email as (.+) and password as (.+)$")
    public void enterSignup(String name, String email, String password ) {
        signupPage.enterUserName(name);
        signupPage.enterEmail(email);
        signupPage.enterPassword(password);
    }


   @When("^I click submit button$")
    public void clickOnSubmit() {
        signupPage.clickOnSubmitButton();
    }

    @Then("^I verify invalid email address$")
    public void invalidEmail() {
        Assert.assertEquals(signupPage.getSignupText(), "Signup");

    }

}








