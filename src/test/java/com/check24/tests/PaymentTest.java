package com.check24.tests;

import com.check24.driver.Driver;
import com.check24.driver.DriverManager;
import com.check24.pages.HomePage;
import com.check24.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    @DataProvider
    public static Object[][] getData()
    {
        return new Object[][]{
                {"admin","admin1234","OrangeHRM"}
        };
    }
    @Test(description="Check the title of payment page",dataProvider = "getData")
    public void loginTest(String username,String password,String expectedTitle)  {
        LoginPage login =new LoginPage();
        login.loginToApplication(username,password);
        HomePage homepage=new HomePage();
        String actualTitle=homepage.getHomePageTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}


