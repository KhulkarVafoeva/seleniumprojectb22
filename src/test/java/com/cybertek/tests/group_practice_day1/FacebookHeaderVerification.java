package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) {
        //TC #3: Facebook header verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify header text is as expected:
        //Expected: “Connect with friends and the world around you on Facebook.”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        driver.findElement(By.tagName("h2")).getText();

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = driver.findElement(By.tagName("h2")).getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }
    }
}
