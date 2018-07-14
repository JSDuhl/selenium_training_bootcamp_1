package framework;

import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class HomePage extends BasePage {


    private By signInLink = By.xpath("//a[contains(text(),'Sign In')]");
    private By joinButton = By.xpath("//a[@class='btn btn-success']");
    private By autoSearch = By.xpath("//input[@id='aa-search-input']");
    private By userIcon=By.xpath("//a[@role='button'//img[@class='img-circle']");
    private By gigTitle=By.xpath("//h4/.");
    private By priceTag=By.xpath("//h3/.");
    private By post=By.xpath("//*[@class='container section']//div[@class='gig-card']");



    public void clickOnSignIn() {
        clickOn(signInLink);
    }

    public void clickOnJoinButton() {
        clickOn(joinButton);
    }

    public void enterAutoSearchTerm(String enterSearch) {
        sendText(autoSearch, enterSearch);
    }

    public void doesTitleHaveText (){
        ArrayList arrayList = new ArrayList();

    }


        /*   1. count 'em all
        2. check to see if the title has text
        3. if no text, needs to be counted
        4. subtract total - no text
         */


}











