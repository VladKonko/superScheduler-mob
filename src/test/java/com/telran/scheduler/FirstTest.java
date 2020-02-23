package com.telran.scheduler;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTest {
    AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("deviceName","QA22");
        caps.setCapability("platformVersion","8.0");
        caps.setCapability("automationName","Appium");
        caps.setCapability("appPackage","com.example.svetlana.scheduler");
        caps.setCapability("appActivity",".presentation.splashScreen.SplashScreenActivity");
        caps.setCapability("app","C:/Users/VladQA/Documents/GitHub/superScheduler-mob/src/test/resources/apk/v.0.0.3.apk");
    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);


    }
    @Test
    public void testOpenApp(){
        System.out.println("sooo goood ");
    }



    @AfterClass
    public void tearDown() throws InterruptedException {
    Thread.sleep(4000);
    driver.quit();
    }
}
