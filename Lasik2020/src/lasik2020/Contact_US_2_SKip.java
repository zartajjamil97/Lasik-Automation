/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasik2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author staff
 */
public class Contact_US_2_SKip {
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.2020lasikindianapolis.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[contains(text(),'Menu')]")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//a[contains(text(),'Cost & Financing')]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(text(),'CLICK HERE TO GET STARTED')]")).click();
        Thread.sleep(3000);
        
         driver.findElement(By.className("skip-schedule")).click();

        //FirstName
        driver.findElement(By.id("field_5_1")).click();
        driver.findElement(By.id("input_5_1")).sendKeys("Test Genetech");
        //LastName
        driver.findElement(By.id("field_5_2")).click();
        driver.findElement(By.id("input_5_2")).sendKeys("Test");
        //DOB
        driver.findElement(By.id("input_5_20")).sendKeys("08311997");
        //Contact Number
        driver.findElement(By.xpath("//li[@id='field_5_4']")).click();
        driver.findElement(By.id("input_5_4")).sendKeys("0000000000");

        //Email Address
        driver.findElement(By.id("field_5_3")).click();
        driver.findElement(By.id("input_5_3")).sendKeys("zartaj@yopmail.com");

        //Please provide the name and location of your last eye exam so we can obtain your records for you*
        //Name
        driver.findElement(By.id("input_5_12_3")).sendKeys("abc@$%&1234");
        //Location
        driver.findElement(By.id("input_5_12_6")).sendKeys("abc@$%&1234");

        /**Best time for us to contact you? (DROPDOWN)
        driver.findElement(By.id("input_5_7")).click();
        Select p = new Select(driver.findElement(By.id("input_5_7")));
        p.selectByIndex(1);
        //RadioButton
        driver.findElement(By.id("label_5_17_0")).click();**/
        
        //Submit button
        driver.findElement(By.id("gform_submit_button_5")).click();

     }
    
}


