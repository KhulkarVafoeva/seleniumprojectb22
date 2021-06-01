package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']"));
        WebElement passwordHeader = driver.findElement(By.xpath("//h2"));
        WebElement emailText =driver.findElement(By.cssSelector("label[for='email']"));
        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));


        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("passwordHeader.isDisplayed() = " + passwordHeader.isDisplayed());
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());
        System.out.println("inputBox.isDisplayed() = " + inputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());


        driver.close();
    }
}
