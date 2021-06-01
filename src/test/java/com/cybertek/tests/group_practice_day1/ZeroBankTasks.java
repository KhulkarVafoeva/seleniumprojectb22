package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTasks {
    public static void main(String[] args) {
        //TC #3: Zero Bank login title verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Enter username: username
        //4. Enter password: password
        //5. Verify title changed to:
        //Expected: “Zero – Account Summary”

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);

        driver.navigate().back();

        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("account_summary_link")).click();

        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }

        driver.close();


    }
}