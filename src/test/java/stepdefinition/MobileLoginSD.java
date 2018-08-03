package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import framework.BasePage;
import framework.mobile_pages.LandingPage;
import framework.web_pages.LoginPage;


public class MobileLoginSD  extends BasePage {

    LandingPage landingPage = new LandingPage();
    LoginPage loginScreen = new LoginPage();

    @Given("^I am on mobile login page$")
    public void iAmOnmobileLoginPage() {
        landingPage.tapOnYesButton();
        //landingPage.tapOnMainMenuButton();
        landingPage.tapOnSignInButton();
    }

    @When("^I sign in using username (.+) and password (.+) in mobile app$")
    public void iAmOnHomePage(String username, String password) {
     //   loginScreen.enterEmailAddress(username);
        loginScreen.enterPassword(password);

    }


}
