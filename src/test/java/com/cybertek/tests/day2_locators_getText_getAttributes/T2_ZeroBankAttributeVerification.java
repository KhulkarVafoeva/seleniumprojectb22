package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));


        String expectedText = "Zero Bank";
        String actualText = zeroBankLink.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!");
        }

        String expectedInAttributeValue = "index.html";
        String actualHrefValue = zeroBankLink.getAttribute("href");

        System.out.println(actualHrefValue);

        if (actualHrefValue.contains(expectedInAttributeValue)) {
            System.out.println("Href attribute verification PASSED!");
        } else {
            System.out.println("Href attribute verification FAILED!");
        }
    }
}
