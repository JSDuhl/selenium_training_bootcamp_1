package framework;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailTextField=By.xpath("//input[@id='email']");
    private By passwordTextField=By.xpath("//input[@id='password']");
    private By submitButton=By.xpath("//button[@class='btn btn-success']");
    private By emailLabelTitle=By.xpath("//label[@for='email']");



    public  void enterEmail(String enterEmail) {
        sendText(emailTextField, enterEmail);
    }

    public void enterPassword(String enterPassword) {
        sendText(passwordTextField, enterPassword);
    }

    public String getEmailTitle() { return getTextFromElement(emailLabelTitle); }

    public void clickOnLoginButton() {
        clickOn(submitButton);
    }
}