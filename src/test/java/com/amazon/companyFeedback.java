package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class companyFeedback
{

    String companyURL="https://www.amazon.in/sp?ie=UTF8&seller=A1MJB9IA6RMQZ7";




    @Test
    public void companyFeedbackcode() throws Exception {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(companyURL);

        Thread.sleep(3000);

        driver.manage().window().maximize();


            WebElement nextButton=driver.findElement(By.xpath("//a[text()='Next ']"));

            if(nextButton.isDisplayed())
            {


                for(int i=1;i<=10;i++)
                {

                System.out.println(" Page Number: "+i);

                String feedbackTable=driver.findElement(By.xpath("//div[@id='feedback-table']")).getText();

                System.out.println(feedbackTable);
                System.out.println("------------------------------------------------------");

                if (nextButton.isDisplayed()) {

                    nextButton.click();
                    Thread.sleep(3000);

                }

                else
            {
                break;
            }


            }

        }

        driver.quit();

    }

}
