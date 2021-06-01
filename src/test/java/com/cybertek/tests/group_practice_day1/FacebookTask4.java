package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTask4 {
    //TC #4: Facebook header verification
    //1. Open Chrome browser
    //2. Go to https://www.facebook.com
    //3. Verify “Create a page” link href value contains text:
    //Expected: “registration_form”
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        String expectedValue = "registration_form";
        String actualValue = driver.findElement(By.className("_8esh")).getAttribute("href");

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualValue.contains(expectedValue)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }


    }
}
