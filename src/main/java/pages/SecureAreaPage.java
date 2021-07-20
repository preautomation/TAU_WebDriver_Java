package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {

    private static WebDriver driver;
    private By sucessmessage = By.id(("flash"));

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String flashAlert() {
        String sucessalert = driver.findElement(sucessmessage).getText();
        return sucessalert;
    }

}
