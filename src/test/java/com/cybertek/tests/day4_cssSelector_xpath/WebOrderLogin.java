package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebOrderLogin {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = WebDriverFactory.getDriver("Chrome");
       driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String expectedTitle2 = "Web Orders";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }

        driver.close();
    }
}
