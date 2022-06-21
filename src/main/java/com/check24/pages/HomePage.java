package com.check24.pages;


import com.check24.driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage {

    public String getHomePageTitle()
    {
       return DriverManager.getDriver().getTitle();
    }


}




