package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }


        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        //2. Go to https://www.facebook.com
        //3. Enter incorrect username
        //4. Enter incorrect password
        //5. Verify title changed to:
        //Expected: “Log into Facebook | Facebook”




    }
}
