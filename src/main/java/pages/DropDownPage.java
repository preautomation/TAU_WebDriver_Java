package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {


    private static WebDriver driver;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropdown().selectByVisibleText(option);
    }


    public List<String> getAllSelectedOptions() {
        List<WebElement> selectOptions = findDropdown().getAllSelectedOptions();
        /*list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }
        */
        return selectOptions.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropdown() {
        return new Select(driver.findElement(By.id("dropdown")));
    }
}
