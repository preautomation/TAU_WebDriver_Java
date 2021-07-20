package Login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage= homePage.formAuthentication();
        SecureAreaPage secureAreaPage = loginPage.Login("tomsmith","SuperSecretPassword!");
        Assert.assertTrue(secureAreaPage.flashAlert().contains("You logged into a secure area!"),"Login was not sucessful");
    }
}
