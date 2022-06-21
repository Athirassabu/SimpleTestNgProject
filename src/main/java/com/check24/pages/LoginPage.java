package com.check24.pages;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.check24.driver.DriverManager;
import com.check24.reports.ExtentLogger;
import com.check24.reports.ExtentManager;
import com.check24.utils.ScreenshotUtils;
import org.openqa.selenium.By;

import static com.check24.utils.SeleniumUtils.*;

public class LoginPage {
    private static final By TEXT_USERNAME=By.id("txtUsername");
    private static final  By TEXT_PASSWORD=By.id("txtPassword");
    private static final By BUTTON_LOGIN=By.id("txtPassword");

private LoginPage enterUsername(String username)
{
    sendKeys(TEXT_USERNAME,username);
    ExtentLogger.pass("Username is entered successfully");
    return this;
}
    private LoginPage enterPassword(String password)
    {
        sendKeys(TEXT_PASSWORD,password);
        ExtentLogger.pass("Password is entered successfully");
        return this;
    }

    private HomePage clickLogin()
    {
      click(BUTTON_LOGIN);
      ExtentLogger.pass("Login button is clicked successfully");
      return new HomePage();
    }

    public HomePage loginToApplication(String username, String password)  {
        return enterUsername(username).enterPassword(password).clickLogin();
    }
}




