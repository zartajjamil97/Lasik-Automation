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
public class AddCalanderEmpty {

    //**************************************  ADD EMPTY CALANDER    ***************************************//
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.2020lasikindianapolis.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //Avalable date selector
        
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

            if (text.equalsIgnoreCase("23")) {
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
        driver.findElement(By.id("field_3_1")).click();
        driver.findElement(By.id("input_3_1")).sendKeys("");
        //LastName
        driver.findElement(By.id("field_3_2")).click();
        driver.findElement(By.id("input_3_2")).sendKeys("");
        //DOB
        driver.findElement(By.id("input_3_21")).sendKeys("31081997");
        //Contact Number
        driver.findElement(By.id("field_3_4")).click();
        driver.findElement(By.id("input_3_4")).sendKeys("");

        //Email Address
        driver.findElement(By.id("field_3_3")).click();
        driver.findElement(By.id("input_3_3")).sendKeys("");

        //Please provide the name and location of your last eye exam so we can obtain your records for you*
        //Name
        driver.findElement(By.id("input_3_20_3")).sendKeys("");
        //Location
        driver.findElement(By.id("input_3_20_6")).sendKeys("");

        /**Best time for us to contact you? (DROPDOWN)
        driver.findElement(By.id("field_3_8")).click();
        Select p = new Select(driver.findElement(By.id("input_3_8")));
        p.selectByIndex(1);
        //RadioButton
        driver.findElement(By.id("label_3_17_0")).click();**/

        driver.findElement(By.id("gform_submit_button_3")).click();
    }
}
