package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage formAuthentication() {
        clickLinkofExample("Form Authentication");
        return new LoginPage(driver);
    }

    public void clickLinkofExample(String examplelinkText) {
        driver.findElement(By.linkText(examplelinkText)).click();
    }

    public DropDownPage dropDown() {
        clickLinkofExample("Dropdown");
        return new DropDownPage(driver);
    }

    public ForgotPasswordlinkPage forgotPasswordPage() {
        clickLinkofExample("Forgot Password");
        return new ForgotPasswordlinkPage(driver);
    }
}
