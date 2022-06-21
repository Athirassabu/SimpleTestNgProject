package com.check24.reports;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {

    private ExtentManager(){}

    private static final ThreadLocal<ExtentTest> threadLocal = new ThreadLocal<>();

    public static ExtentTest getExtentTest(){

        return  threadLocal.get();
    }

    public static void setExtentTest(ExtentTest test){

        threadLocal.set(test);
    }
}
