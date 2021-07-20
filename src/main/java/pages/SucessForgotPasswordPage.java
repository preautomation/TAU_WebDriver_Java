package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SucessForgotPasswordPage {

    private static WebDriver driver;
    private By successmessage = By.xpath("//h1[text()='Internal Server Error']");

    public SucessForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

 
    public String flashAlertSuccessMessage() {
        String sucessmessage = driver.findElement(successmessage).getText();
        return sucessmessage;
    }

}
