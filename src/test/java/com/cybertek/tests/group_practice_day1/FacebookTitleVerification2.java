package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerification2 {
    //TC #2: Facebook incorrect login title verification
    //1. Open Chrome browser
    //2. Go to https://www.facebook.com
    //3. Enter incorrect username
    //4. Enter incorrect password
    //5. Verify title changed to:
    //Expected: “Log into Facebook | Facebook”
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        driver.findElement(By.name("email")).sendKeys("khulkarvafoeva@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Password" + Keys.ENTER);

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }

        driver.close();


    }

}
