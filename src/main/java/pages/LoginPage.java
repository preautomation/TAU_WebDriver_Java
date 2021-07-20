package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static WebDriver driver;

    private final By usernamefield = By.id("username");
    private final By passwordfield = By.id("password");
    private final By loginButton = By.cssSelector(("#login button"));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SecureAreaPage Login(String username, String password){
        driver.findElement(usernamefield).sendKeys(username);
        driver.findElement(passwordfield).sendKeys(password);
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
