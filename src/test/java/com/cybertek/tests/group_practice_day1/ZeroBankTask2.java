package com.cybertek.tests.group_practice_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTask2 {
    //TC #4: Zero Bank login title verification
    //1. Open Chrome browser
    //2. Go to http://zero.webappsecurity.com/login.html
    //3. Enter username: username
    //4. Enter password: password
    //5. Click to “Account Activity” link
    //6. Verify title changed to:
    //Expected: “Zero – Account Activity”
    //7. Click to “Transfer Funds” link
    //8. Verify title changed to:
    //Expected: “Zero – Transfer Funds”
    //9. Click to “Pay Bills” link
    //10. Verify title changed to:
    //Expected: “Zero - Pay Bills”
    //11. Click to “My Money Map” link
    //12. Verify title changed to:
    //Expected: “Zero – My Money Map”
    //13. Click to “Online Statements” link
    //14. Verify title changed to:
    //Expected: “Zero – Online Statements”
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.id("user_password")).sendKeys("password" + Keys.ENTER);

        driver.navigate().back();

        driver.findElement(By.className("headers")).click();

        String expectedTitle = "Zero - Account Activity";
        String actualTitle =  driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }


        driver.findElement(By.partialLinkText("Transfer")).click();

        String expectedTitle2 = "Zero - Transfer Funds";
        String actualTitle2 =  driver.getTitle();



        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }


        driver.findElement(By.linkText("Pay Bills")).click();

        String expectedTitle3 = "Zero - Transfer Funds";
        String actualTitle3 =  driver.getTitle();



        if (actualTitle3.equals(expectedTitle3)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }

        driver.findElement(By.linkText("My Money Map")).click();

        String expectedTitle4 = "Zero - My Money Map";
        String actualTitle4 =  driver.getTitle();



        if (actualTitle4.equals(expectedTitle4)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }


        driver.findElement(By.linkText("Online Statements")).click();

        String expectedTitle5 = "Zero - Online Statements";
        String actualTitle5 =  driver.getTitle();


        if (actualTitle5.equals(expectedTitle5)) {
            System.out.println("Title verification has PASSED!");
        } else {
            System.out.println("Title verification has FAILED!");
        }



        driver.close();


    }

}