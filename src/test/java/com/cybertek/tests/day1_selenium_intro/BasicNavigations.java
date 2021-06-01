package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2-create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        //we are chaining methods together. this line maximise browser window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();  only for mac

        //3- get the page for Tesla.com
        driver.get("https://www.Tesla.com");
        System.out.println("Current title: "+driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //putting 3 seconds of wait
         Thread.sleep(3000);

        //Going back using navigations
         driver.navigate().back();

         //Going forward using navigations
        Thread.sleep(3000);
        driver.navigate().forward();

        //refreshing the page
        Thread.sleep(3000);
        driver.navigate().refresh();

        //going to another url using.to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title: "+driver.getTitle());
        currentUrl = driver.getCurrentUrl();

        //closes the currently open browser. it only closes one browser
        driver.close();

        //driver.quit() --> closes all of the opened browsers or tables within the same session





    }
}
