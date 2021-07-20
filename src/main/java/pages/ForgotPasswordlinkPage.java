package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordlinkPage {
    private static WebDriver driver;

    public ForgotPasswordlinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String emailid) {
        driver.findElement(By.id("email")).sendKeys(emailid);
    }

    public SucessForgotPasswordPage clickRetrivePassword() {
        driver.findElement(By.id("form_submit")).click();
        return new SucessForgotPasswordPage(driver);
    }


}
