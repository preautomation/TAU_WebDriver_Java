package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    //WebDriverManager.chromedriver().

    @BeforeClass
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver_win32_91.0.4472.101/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(375, 812));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.print(driver.getTitle());

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}


