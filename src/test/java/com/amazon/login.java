package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

    String URL="https://deps--sweqa.sandbox.my.salesforce.com/";
    String Username="harshu.nm@education.vic.gov.au.deps.sweqa";
    String Password="90477@Test1";


    @Test
    public void loginTest() {
      

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);

        driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(Password);

        driver.findElement(By.xpath("//input[@name='Login']")).click();

        driver.manage().window().maximize();
        


        

    }


}
