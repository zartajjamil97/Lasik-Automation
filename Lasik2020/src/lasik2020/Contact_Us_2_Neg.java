/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasik2020;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author staff
 */
public class Contact_Us_2_Neg {
     public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.2020lasikindianapolis.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        //driver.findElement(By.xpath("//span[contains(text(),'Menu')]")).click();
        //Thread.sleep(3000);
       
        driver.findElement(By.xpath("//a[contains(text(),'Cost & Financing')]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[contains(text(),'CLICK HERE TO GET STARTED')]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.name("date")).click();
        
        //Next Button in calander
        for(int a=1;a<3;a++)
    {
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    }
        List<WebElement> date;
        date = driver.findElements(By.className("ui-state-default"));

        int count = driver.findElements(By.className("ui-state-default")).size();
        for (int i = 0; i < count; i++) {

            String text;
            text = driver.findElements(By.className("ui-state-default")).get(i).getText();

            if (text.equalsIgnoreCase("27")) {
                driver.findElements(By.className("ui-state-default")).get(i).click();
            }
        }
        //Available Time Selector
        //driver.findElement(By.xpath("//select[@name='time']")).click();
        Select s;
        s = new Select(driver.findElement(By.xpath("//select[@name='time']")));
        Thread.sleep(2000);
        s.selectByIndex(1);

        driver.findElement(By.className("date-time-submit")).click();

        //FirstName
        driver.findElement(By.id("field_5_1")).click();
        driver.findElement(By.id("input_5_1")).sendKeys("Zartaj!@212");
        //LastName
        driver.findElement(By.id("field_5_2")).click();
        driver.findElement(By.id("input_5_2")).sendKeys("Jamil!@2223");
        //DOB
        driver.findElement(By.id("input_5_20")).sendKeys("31081997");
        //Contact Number
        driver.findElement(By.xpath("//li[@id='field_5_4']")).click();
        driver.findElement(By.id("input_5_4")).sendKeys("1111111111");

        //Email Address
        driver.findElement(By.id("field_5_3")).click();
        driver.findElement(By.id("input_5_3")).sendKeys("zartajyopmail.com");

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
