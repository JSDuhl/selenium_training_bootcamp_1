package framework;

import org.openqa.selenium.By;
import java.util.Random;

public class SignupPage extends BasePage {

    private By usernameTextField = By.name("username");
    private By emailAddressTextField = By.name("email");
    private By passwordTextField = By.name("password");
    private By submitButton = By.xpath("//button[@class='btn btn-success']");
    private By signupText = By.xpath("//*[contains(text(),'Signup')]");


    public void enterUserName(String enterUsername) {
        sendText(usernameTextField, enterUsername);
    }

    public void enterEmail(String enterEmail) {
        sendText(emailAddressTextField, enterEmail);
    }

    public void enterPassword(String enterPassword) {
        sendText(passwordTextField, enterPassword);
    }

    public void clickOnSubmitButton() {
        clickOn(submitButton);
    }

    public String getSignupText() {
        return getTextFromElement(signupText);
    }

    public void enterRandomEmail(String email) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        sendText(emailAddressTextField,("username" + randomInt + "@gmail.com"));
    }


}


