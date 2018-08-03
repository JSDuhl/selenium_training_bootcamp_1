package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import static java.time.Duration.ofMillis;


public class MobileBasePage {

    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    public void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumWrapper.getAppiumDriver(), 15, TimeUnit.SECONDS), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    public void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    public void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }






    //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();


    public  void rightLeftSwipe() {

        AppiumDriver driver = AppiumWrapper.getAppiumDriver();
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.05);
        int starty = size.height / 2;

        new TouchAction(driver)
                .press(startx, starty)
                .waitAction(Duration.ofMillis(2000))
                .moveTo(endx, starty)
                .release().perform();

    }


    public  void leftRightSwipe() {
        AppiumDriver driver = AppiumWrapper.getAppiumDriver();
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        int startx = (int) (size.width * 0.70);
        int endx = (int) (size.width * 0.30);
        int starty = size.height / 2;

        new TouchAction(driver)
                .press(endx, starty)
                .waitAction(Duration.ofMillis(1000))
                .moveTo(startx, starty)
                .release().perform();

    }





/*

    //Horizontal Swipe by percentages
    public void horizontalSwipeByPercentage (double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = AndroidDriver.manage().window().getSize();
        int anchor = (int) (size.height * anchorPercentage);
        int startPoint = (int) (size.width * startPercentage);
        int endPoint = (int) (size.width * endPercentage);

        new TouchAction(driver)
                .press(point(startPoint, anchor))
                .waitAction(Duration.ofMillis(1000)
                .moveTo(point(endPoint, anchor))
                .release().perform();
    }

    //Vertical Swipe by percentages
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        org.openqa.selenium.Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);

        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(Duration.ofMillis(1000)
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

*/
}



