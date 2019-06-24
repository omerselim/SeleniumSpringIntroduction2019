package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
    public static void main(String[] args) {
//        Create a new class called Task1
//◈ Launch Chrome and navigate to : https://www.cybertekschool.com/
//◈ Launch Firefox and navigate to : http://www.practice.cybertekschoool.com/

        System.setProperty("webdriver.chrome.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/cybertekstudio/Desktop/selenium dependecies/drivers/geckodriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://cybertekschool.com");

        driver = new FirefoxDriver();
        driver.get("http://practice.cybertekschool.com");


    }
}

