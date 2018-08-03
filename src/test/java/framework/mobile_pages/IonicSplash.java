package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Title;

import static framework.AppiumWrapper.getAppiumDriver;

public class IonicSplash extends MobileBasePage {


    //splash page
    // @AndroidFindBy(accessibility ="Welcome to ICA")
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Welcome to ICA']")
    private MobileElement Title;


    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='CONTINUE arrow forward ']")
    private MobileElement continueButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='SKIP ']")
    private MobileElement skipButton;

    public void confirmTitle() throws InterruptedException {
        Thread.sleep(2000);
        Title.isDisplayed();
        System.out.println("Welcome title is displayed");

    }

    public void tapOnSkipButton() {

        tapOn(skipButton);
        System.out.println("button tapped");
    }


    public void confirmContinue() throws InterruptedException {
        Thread.sleep(2000);
        continueButton.isDisplayed();
        System.out.println("Continue is displayed");

    }



    public void swipeRight(int numnberofswipes) {
        for (int i = 0; i <= numnberofswipes; i++) {
            rightLeftSwipe();

        }









    }

}
