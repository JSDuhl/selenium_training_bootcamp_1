package framework.mobile_pages;

import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.xpath;

public class IonicHome extends MobileBasePage {



    //search
    @AndroidFindBy(xpath = "//android.view.View[(@text('Search')]")
    private MobileElement searchField;

    @AndroidFindBy(xpath = "//android.view.View[@index='2']")
    private MobileElement searchResults;


    //toolbar
    @AndroidFindBy(xpath = "//android.view.View[@content-desc='calendar Schedule']")
    private MobileElement scheduleMenu;


    //Left hamburger menu options

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='menu']")
    private MobileElement hamburgerMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='calendar Schedule']")
    private MobileElement calendarMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='contacts Speaker']")
    private MobileElement speakersMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='map Map']")
    private MobileElement mapMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='information circle About']")
    private MobileElement aboutMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='log in Login']")
    private MobileElement loginMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='help Support']")
    private MobileElement supportMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='person add Signup']")
    private MobileElement signupMenu;


    //filter page

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='options ']")
    private MobileElement filterMenu;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Angular']")
    private MobileElement angularToggle;

//    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Reset All Filters ']")
    @AndroidFindBy(accessibility = "Reset All Filters")
    private MobileElement resetText;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='DONE']")
    private MobileElement doneButton;




    public void confirmFilter() throws InterruptedException {
        Thread.sleep(2000);
        filterMenu.isDisplayed();
        System.out.println("filter icon is displayed");

    }





    public void confirmSchedule() throws InterruptedException {
        Thread.sleep(2000);
        scheduleMenu.isDisplayed();
        System.out.println("schedule menu is displayed");

    }

    public void tapOnHamburgerMenu() {
        tapOn(hamburgerMenu);
    }


    public boolean confirmMenuFields() {
        try {
            calendarMenu.isDisplayed();
            System.out.println("menu");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("No menu");
            return false;

        }

    }


      /*  public void confirmMenuSwitch() {
        switch (MobileElement) {
            case 1:
                calendarMenu;
                return true;
            System.out.println("calendar displays");
            case 2:
                speakersMenu.isDisplayed();
                return true;
            case 3:
                mapMenu.isDisplayed();
                return true;
            case 4:
                aboutMenu.isDisplayed();
                return true;
            case 5:
                loginMenu.isDisplayed();
                return true;
            case 6:
                supportMenu.isDisplayed();
                return true;
            case 7:
                signupMenu.isDisplayed();
                return true;

        }


    }*/


    public void enterSearchTerm(String enterSearch) {
        setValue(searchField, enterSearch);
    }

    public void tapOnFilterMenu() {

        tapOn(filterMenu);


    }

    public void tapOnReset(){
        tapOn(resetText);
        tapOn(resetText);

    }




}