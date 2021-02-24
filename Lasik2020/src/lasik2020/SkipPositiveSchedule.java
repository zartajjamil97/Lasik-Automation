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
public class SkipPositiveSchedule {

       //**************************************  SKIP-POSITIVE SCHEDULING    ***************************************//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.2020lasikindianapolis.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='widget_text Button-section panel-widget-style panel-widget-style-for-4702-0-0-3']//a[contains(text(),'Schedule a Consultation')]")).click();
        
        driver.findElement(By.className("skip-schedule")).click();
       
        //FirstName
        driver.findElement(By.id("field_3_1")).click();
        driver.findElement(By.id("input_3_1")).sendKeys("Test Genetech");
        //LastName
        driver.findElement(By.id("field_3_2")).click();
        driver.findElement(By.id("input_3_2")).sendKeys("Testing");
        //DOB
        driver.findElement(By.id("input_3_21")).sendKeys("08311997");
        //Contact Number
        driver.findElement(By.id("field_3_4")).click();
        driver.findElement(By.id("input_3_4")).sendKeys("1234567890");

        //Email Address
        driver.findElement(By.id("field_3_3")).click();
        driver.findElement(By.id("input_3_3")).sendKeys("zartaj@yopmail.com");

        //Please provide the name and location of your last eye exam so we can obtain your records for you*
        //Name
        driver.findElement(By.id("input_3_20_3")).sendKeys("20/20institute");
        //Location
        driver.findElement(By.id("input_3_20_6")).sendKeys("abc123!@#$%^&*()");

        /**Best time for us to contact you? (DROPDOWN)
        driver.findElement(By.id("field_3_8")).click();
        Select s = new Select(driver.findElement(By.id("input_3_8")));
        s.selectByIndex(1);
        //RadioButton
        driver.findElement(By.id("label_3_17_0")).click();**/

        driver.findElement(By.id("gform_submit_button_3")).click();
    }

}
