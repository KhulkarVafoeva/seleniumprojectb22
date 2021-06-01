package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("khulkarvafoeva@gmail.com");
        driver.findElement(By.tagName("i")).click();

        String expectedResult = "email_sent";
        String actualResult = driver.getCurrentUrl();

        if (actualResult.contains(expectedResult)) {
            System.out.println("Your e-mail has been sent!");
        } else {
            System.out.println("Your e-mail has not been sent");
        }

        driver.close();

    }
}
