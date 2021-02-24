/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasik2020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author staff
 */
public class ClickHerePositive {
    public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Drivers for selenium\\chromedriver.exe");
	 driver= new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("https://lasikindiaz.wpengine.com");
driver.manage().window().maximize();
driver.findElement(By.className("skip-schedule-btn")).click();

//FirstName
driver.findElement(By.id("input_14_6")).sendKeys("Testing");
//LastName
driver.findElement(By.id("input_14_2")).sendKeys("Testing abc");
//Email
driver.findElement(By.id("input_14_7")).sendKeys("zartaj@yopmail.com");
//ContactNumber
driver.findElement(By.id("input_14_8")).sendKeys("1111111111");
//Message
driver.findElement(By.id("input_14_9")).sendKeys("Testing for new form");
//Submit Button
driver.findElement(By.id("gform_submit_button_14")).click();

}
}
