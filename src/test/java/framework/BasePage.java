package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ru.yandex.qatools.allure.annotations.Attachment;
import stepdefinition.SharedSD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static stepdefinition.SharedSD.getDriver;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage {





    public void clickOn(By locator) {
        try {
            SharedSD.getDriver().findElement(locator).click();
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
          //saveScreenshot();
            e.printStackTrace();
        }
    }


    public void sendText(By locator, String text) {
        try {
            SharedSD.getDriver().findElement(locator).sendKeys(text);
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
            e.printStackTrace();
        }
    }

    public String getTextFromElement(By locator) {
        String text = null;
        try {
            text = SharedSD.getDriver().findElement(locator).getText();
        } catch (NoSuchElementException e) {
            Assert.fail("Element is not found with this locator: " + locator.toString());
            e.printStackTrace();
        }

        return text;
    }


    public boolean isElementDisplayed(By locator) {
        return getDriver().findElement(locator).isDisplayed();
    }


    //darksky
    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("d");
        Date date = new Date();
        String todayDate = sdf.format(date);
        return todayDate;
    }



    public Calendar getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("h a");
        Calendar calobj = Calendar.getInstance();
        System.out.println(sdf.format(calobj.getTime()));
        return calobj;
    }


        public void enterRandomEmail(By locator) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendText(locator,("username" + randomInt + "@gmail.com"));
    }


    //darksky for website times
    public ArrayList<String> WebElementArrayList(By locator) {
        List<WebElement> elementList = getDriver().findElements(locator);
        ArrayList<String> elementArrayList= new ArrayList<>();
        String temp = null;
        for (int i = 0; i < elementList.size()-1; i++) {
            temp = elementList.get(i).getText();

            elementArrayList.add(temp);
        }
        return elementArrayList;
    }


    //darksky for current times
    public ArrayList<String> StringArrayListTimeCheck() {
        String temp = null;
        ArrayList<String> newStringList = new ArrayList();
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < 11; i++) {
            cal.add(Calendar.HOUR, 2);
            SimpleDateFormat sdf = new SimpleDateFormat("ha");
            temp = sdf.format(cal.getTime()).toLowerCase();
            newStringList.add(temp);

        }
        return newStringList;

    }




 /*  public String getAutoSearchResult (By locators){

         List<WebElement> dropdown=   SharedSD.getDriver().findElements(locators);
         for(int i=0;i<dropdown.size();i++){
            String drop_down_values=dropdown.get(i).getText();
            if dropdown.getText(i).equals.element;
            return element.isDisplayed();
}*/





/*
        public void enterUserNameSignup(String enterUsername) {
        sendText(usernameTextField, enterUsername);
    }



        public  void enterEmailLogin(String enterEmail) {
        sendText(emailTextField, enterEmail);
    }

    public void enterPasswordLogin(String enterPassword) {
        sendText(passwordTextField, enterPassword);
    }

  public void enterEmailSignup(String enterEmail) {
        sendText(emailAddressTextField, enterEmail);
    }

    public void enterPasswordSignup(String enterPassword) {
        sendText(passwordTextField, enterPassword);
    }



    }




/* public boolean verifyUserIsLoggedIn() {

        try {
             getDriver().findElement(By.xpath("//a[@role='button']//img[@class='img-circle']")).isDisplayed();
             return true;
            System.out.println("User is logged in");
        } catch (NoSuchElementException) {
            return false;
            System.out.println("User is  not logged in");
        }*/





        public void clickOnBrowserBackArrow () {
            SharedSD.getDriver().navigate().back();
        }

        public void clickOnBrowserForwardArrow () {
            SharedSD.getDriver().navigate().forward();
        }

        public void refreshBrowser () {
            SharedSD.getDriver().navigate().refresh();
        }


    }





