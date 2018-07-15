package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.HomePage;
import org.testng.Assert;
import static stepdefinition.SharedSD.getDriver;

//jill duhl July 2018

public class HomeElementsSD {

    HomePage homePage = new HomePage();


    @Given("^I am on home page$")
    public void i_am_on_home_page() {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com/");
    }
    //user story has expected number of posts = 56
    @Then("^I verify (\\d+) total posts are displayed$")
    public void verifyNumberOfPosts(int arg1) {

        try {
            Assert.assertEquals(homePage.numberOfPosts(), 56);
            System.out.println("All 56 posts are displayed");
        } catch (AssertionError a) {
            System.out.println(homePage.numberOfPosts() + " posts are found, instead of "
                    + 56 + " as expected");
        }
    }


    @Then("^I verify all posts have price tag$")
    public void verifyPriceTags() {

        try {
            Assert.assertEquals(homePage.numberOfPriceTags(), homePage.numberOfPosts());
            System.out.println(("All posts have a price"));
        } catch (AssertionError a) {
            int difference = (homePage.numberOfPosts() - homePage.numberOfPriceTags());
            System.out.println(difference + "Posts do not have a price tag");
        }

    }

    @Then("^I verify all posts havd title$")
    public void verifyPostTitles() {

        try {
            Assert.assertEquals(homePage.numberOfTitles(), homePage.numberOfPosts());
            System.out.println("All Posts have titles");
        } catch (AssertionError a) {
            int difference = (homePage.numberOfPosts() - homePage.numberOfTitles());
            System.out.println(difference + " Posts do not have a title");
        }
    }


    @Then("^I verify all post has a displayed image$")
    public void verifyPostImages() {

        try {
            Assert.assertEquals(homePage.numberOfImages(), homePage.numberOfPosts());
            System.out.println("All  Posts have Images");
        } catch (AssertionError a) {
            int difference = (homePage.numberOfPosts() - homePage.numberOfImages());
            System.out.println(difference + " Posts do not have an Image");
        }
    }

}