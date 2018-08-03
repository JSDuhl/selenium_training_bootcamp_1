package framework.web_pages;


import com.sun.jna.StringArray;
import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static stepdefinition.SharedSD.getDriver;


public class DarkSkyHome extends BasePage {
    private By timeMachineButton = By.xpath("//a[@class='button']");
    private By timeMachineDescription = By.xpath("//div[@class='description']");
    private By times = By.xpath("//div[@class='hours']//following-sibling::*//span[2]");
    private By todayInfo = By.xpath("//body[@class='forecast']/div[@id='week']/a[1]");
    private By minTemp = By.xpath("//*[@id='week']/a[1]/span[2]/span[1]");
    private By minTempDetail = By.xpath("//*[@id='week']/div[2]/div[1]/div[2]/div[1]/span[1]/span[1]");
    private By maxTemp = By.xpath("//*[@id=\"week\"]/a[1]/span[2]/span[3]");
    private By maxTempDetail = By.xpath("//*[@id=\"week\"]/div[2]/div[1]/div[2]/div[1]/span[3]/span[1]");
    private By calendarDay = By.xpath("//td[@class='is-today']");


    public void twoHourImplement() {
        ArrayList<String>timeLineList=WebElementArrayList(times);
        System.out.println("List of Times on the Site: " + timeLineList);
        ArrayList<String>timeArrayList=StringArrayListTimeCheck();
        System.out.println("Current Time line " + timeArrayList );


        try {
            Assert.assertEquals(WebElementArrayList(times), StringArrayListTimeCheck());
            System.out.println("The arrays match");
        } catch (AssertionError error) {
            Assert.fail("These are  not equal arrays");
       }}


        public void clickOnTodayInfo(){
            getDriver().findElement(todayInfo).click();

        }

        public void compareMin(){
            String minimum = getTextFromElement(minTemp);
            System.out.println("minimum temperature = " + minimum);
            String minDetail = getTextFromElement(minTempDetail);
            System.out.println("minimum Detail temperature = " + minDetail);

            try {
                Assert.assertEquals(minimum, minDetail);
                System.out.println("Minimum Temperatures are a match");
            } catch (AssertionError error) {
                Assert.fail("your minimum temperatures do not match");
            }

        }


        public void compareMax(){
            String maximum = getTextFromElement(maxTemp);
            System.out.println(("Maximum temperature = " + maximum));
            String maxDetail = getTextFromElement(maxTempDetail);
            System.out.println("maximum Detail temperature = " + maxDetail);
            try {
                Assert.assertEquals(maximum, maxDetail);
                System.out.println("Maximum Temperatures are a match");

            } catch (AssertionError error) {
                Assert.fail("your maximum values do not match");
            }

        }

        public String timeMachineTextLine () {
            return getTextFromElement(timeMachineDescription);
        }

        public void clickOnTimeMachine () {
            clickOn(timeMachineButton);
        }

        public void confirmTodaysDate () {
            String today = getDate();
            List<WebElement> dayList = getDriver().findElements(calendarDay);
            try {
                for (WebElement day : dayList) {
                    String expectedDay = day.getText();
                    if ( expectedDay.equals(today) ) {
                        day.isSelected();
                        System.out.println("today is " + expectedDay);
                        break;
                    }
                }
            } catch (AssertionError error) {
                System.out.println("epic fail");
            }

        }


    }



