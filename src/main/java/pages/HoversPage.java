package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;

    private By hoverImage = By.className("figure");
    private By hoverimagecaption = By.className("figcaption");


    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaption hoverOnFigure(int index) {

        WebElement figure = driver.findElements(hoverImage).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(hoverimagecaption));
    }

    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By profileLink = By.cssSelector("div.figure a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle() {
            String title = driver.findElement(header).getText();
            return title;
        }

        public String getProfileLinkText(){
            String userlink=  driver.findElement(profileLink).getText();
            return userlink;
        }

        public String getProfileLink(){
            String userlinkhref=  driver.findElement(profileLink).getAttribute("href");
            return userlinkhref;
        }
    }
}
