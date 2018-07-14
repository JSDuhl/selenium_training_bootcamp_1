package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static stepdefinition.SharedSD.getDriver;

public class HomeElementsSD {

    HomePage homePage=new HomePage();


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        String URL = getDriver().getCurrentUrl();
        Assert.assertEquals(URL, "https://floating-anchorage-58495.herokuapp.com/" );
    }

   @Then("^I verify (\\d+) total posts are displayed$")
    public void i_verify_total_posts_are_displayed(int arg1) {
        List <WebElement>postList=getDriver().findElements(By.xpath("//*[@class='container section']//*[@class='gig-card']"));
        System.out.println("Total number of posts is " + postList.size());
        //
       // /assertion if postList.size=57 then its ok otherwise generate error
       //expected  actual   error message
    }

   @Then("^I verify all posts have price tag$")
    public void i_verify_all_posts_have_price_tag()  {
       List<WebElement>priceTagList=getDriver().findElements(By.xpath("//h3/."));
       System.out.println("Total number of price tags is " + priceTagList.size());
    }

    @Then("^I verify all posts havd title$")
    public void numberOfTitles(){
       //  verify if text in title
        //iterate through each of them and check if string/or if blank
        //add to another list if not blank
        //
}


   @Then("^I verify all post has a displayed image$")
    public void i_verify_all_post_has_a_displayed_image() {
       List<WebElement> imagesList=getDriver().findElements(By.tagName("img"));
       System.out.println("Total no. of images is " + imagesList.size());
       //check/validate if the image is there or not
       //clue:attribute check if src is there/link is there   is attribute present

    }


}
