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
public class AddCalander {

    //**************************************  ADD POSITIVE CALANDER   ***************************************//
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.2020lasikindianapolis.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class='widget_text Button-section panel-widget-style panel-widget-style-for-4702-0-0-3']//a[contains(text(),'Schedule a Consultation')]")).click();

        //Available date selector
        
        driver.findElement(By.name("date")).click();
        
        //Next Button in calander
        for(int a=1;a<10;a++)
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
        s.selectByIndex(2);

        driver.findElement(By.className("date-time-submit")).click();

        //FirstName
        driver.findElement(By.id("field_3_1")).click();
        driver.findElement(By.id("input_3_1")).sendKeys("zartaj");

        //LastName
        driver.findElement(By.id("field_3_2")).click();
        driver.findElement(By.id("input_3_2")).sendKeys("jamil");
        //DOB
        driver.findElement(By.id("input_3_21")).sendKeys("31081997");
        //Contact Number
        driver.findElement(By.id("field_3_4")).click();
        driver.findElement(By.id("input_3_4")).sendKeys("0000000000");

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
        Select p = new Select(driver.findElement(By.id("input_3_8")));
        p.selectByIndex(1);
        
        //RadioButton
        driver.findElement(By.id("label_3_17_0")).click();**/

        //Submit Button
        driver.findElement(By.id("gform_submit_button_3")).click();
    }
}
