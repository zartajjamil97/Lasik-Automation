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
public class emptyLasik {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lasikindiaz.wpengine.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("skip-schedule")).click();
        driver.findElement(By.id("gform_submit_button_3")).click();

    
}
}
