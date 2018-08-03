package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.web_pages.HomePage;
import framework.web_pages.LoginPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

//jill duhl  July 2018

public class LoginSD {

    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();

    @Given("^User is on the Threely login page$")
    public void iAmOnLoginPage() {

        homePage.clickOnSignIn();
        Assert.assertEquals(loginPage.getEmailTitle(), "EMAIL ADDRESS:");
    }


    @When("^I enter username as (jane@email\\.com) and password as (tester)$")
    public  void enterLogin(String email, String password){
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);

    }

    @And("^I click on (submit) button$")
    public void submitLogin(String button){
        loginPage.clickOnLoginButton();
    }



    @Then("^I verify user icon is displayed$")
    public void verifySignIn(){

            try {
                homePage.findLogoutLink();
                System.out.println("user is logged in");
            } catch(NoSuchElementException a){
                System.out.println("User is not logged in");
            }
        }


}


