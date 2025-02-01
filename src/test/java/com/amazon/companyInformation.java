package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class companyInformation 
{

    String companyURL="https://www.amazon.in/sp?ie=UTF8&seller=A1MJB9IA6RMQZ7";


    @Test
    public void companyInformationcode() throws Exception {


         WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(companyURL);


        driver.manage().window().maximize();


        String overallFeedback=driver.findElement(By.xpath("(//a[@class='a-link-normal feedback-detail-description no-text-decoration'])[1]")).getText();

        System.out.println("Overall Feedback is: "+overallFeedback);

        String OverallStar=driver.findElement(By.xpath("//div[@id='rating-365d-stars']")).getText();

        System.out.println("Overall Stars is: "+OverallStar);

        String overallReview=driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-left']")).getText();

        System.out.println("Overall Review is: "+overallReview);

        driver.quit();

    }


}
