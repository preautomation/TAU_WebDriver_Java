package forgotpassword;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.ForgotPasswordlinkPage;
import pages.SecureAreaPage;
import pages.SucessForgotPasswordPage;

import static org.testng.Assert.*;

public class TestsForgotPassword extends BaseTests {

    @Test
    public void ForgetPassword() {
        ForgotPasswordlinkPage forgetPassword = homePage.forgotPasswordPage();
        forgetPassword.enterEmail("test@emil.com");
        SucessForgotPasswordPage sucessForgotPasswordPage = forgetPassword.clickRetrivePassword();
        assertTrue(sucessForgotPasswordPage.flashAlertSuccessMessage().contains("Internal Server Error"));
    }
}
