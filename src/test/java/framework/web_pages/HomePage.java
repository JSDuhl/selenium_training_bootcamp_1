package framework.web_pages;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import static stepdefinition.SharedSD.getDriver;

//jill duhl, 7/2018
//https://floating-anchorage-58495.herokuapp.com/


public class HomePage extends BasePage {


    private By signInLink = By.xpath("//a[contains(text(),'Sign In')]");
    private By joinButton = By.xpath("//a[@class='btn btn-success']");
    private By iconImage = By.xpath("//a[@role='button']//img[@class='img-circle']");
    private By logoutLink=By.xpath("//a[contains(text(),'Logout')]");
    private By autoSearch = By.xpath("//input[@id='aa-search-input']");
    private By gigTitle = By.xpath("//h4/.");
    private By priceTag = By.xpath("//h3/.");
    private By post = By.xpath("//*[@class='container section']//div[@class='gig-card']");
    private By image = By.tagName("img");


    public void clickOnSignIn() {
        clickOn(signInLink);
    }

    public void clickOnJoinButton() {
        clickOn(joinButton);
    }

    public void enterAutoSearchTerm(String enterSearch) {
        sendText(autoSearch, enterSearch);
    }

    public void findLogoutLink() {
        getDriver().findElement(iconImage).isDisplayed();
        clickOn(iconImage);
        getDriver().findElement(logoutLink).isDisplayed();
    }



    //for verifying counts of web elements on the home page.
    //how many posts, post images, post titles, post prices

    public int numberOfPosts() {
        List<WebElement> posts = getDriver().findElements(post);
        ArrayList<WebElement> postList = new ArrayList(posts);
        int totalPosts = postList.size();
        return totalPosts;
    }


    public int numberOfPriceTags() {
        List<WebElement> priceTags = getDriver().findElements(priceTag);
        ArrayList<WebElement> priceTagList = new ArrayList(priceTags);
        ArrayList<String> newPriceTagList = new ArrayList();
        for (int i = 0; i < priceTagList.size(); i++) {
            String tags = priceTagList.get(i).getText();
            if ( tags.length() >= 2 ) {
                newPriceTagList.add(tags);
            }
        }
        return newPriceTagList.size();
    }


    public int numberOfTitles() {
        List<WebElement> gigTitles = getDriver().findElements(gigTitle);
        ArrayList<WebElement> titleList = new ArrayList(gigTitles);
        ArrayList<String> newTitleList = new ArrayList();
        for (int i = 0; i < titleList.size(); i++) {
            String title = titleList.get(i).getText();
            if ( title.length() > 0 ) {
                newTitleList.add(title);
            }
        }
        return newTitleList.size();
    }


    public int numberOfImages() {

        List<WebElement> images = getDriver().findElements(image);
        ArrayList<WebElement> imageList = new ArrayList(images);
        for (int i = 0; i < imageList.size(); i++){
        }
            return imageList.size();
    }



}









