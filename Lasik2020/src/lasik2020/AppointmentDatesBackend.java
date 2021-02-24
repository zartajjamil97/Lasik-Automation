/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lasik2020;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author staff
 */
public class AppointmentDatesBackend {
    
    //**************************************  APPOINTMENT DATES BACKEND   ***************************************//

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers for selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://lasikindiaz.wpengine.com/wp-admin");
        driver.manage().window().maximize();
        //Login
        driver.findElement(By.id("user_login")).sendKeys(" willowdevelopers");
        driver.findElement(By.id("user_pass")).sendKeys("Genetech@110");
        driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.id("wp-submit")).click();
        //Appointment dashboard
        driver.findElement(By.id("menu-posts-appoinment-schedule")).click();
        //Edit Appointment
        driver.findElement(By.xpath("//tr[@id='post-3987']//a[@class='row-title'][contains(text(),'Appointment Schedule')]")).click();
        Thread.sleep(3000);
        
                                            //APPOINMENT SCHEDULE:
        // DAY DROPDOWN 1
        driver.findElement(By.xpath("//div[@class='as-metabox']/div[1]/div[1]")).click();
        Select a = new Select(driver.findElement(By.name("select-days[0]")));
        Thread.sleep(3000);
        a.selectByValue("4");
        //CheckBox
        //WebElement c = driver.findElement(By.xpath("//div[@class='as-metabox']/div/div[2]/input[@name='select-all-appointment[0]']"));
        //c.click();
        //Time1
        WebElement c = driver.findElement(By.xpath("//div[@class='as-metabox']/div/div[2]/input[2][@type='text']"));
        c.sendKeys("3:45 AM", Keys.ENTER);

        //DAYDROPDOWN 2
        // driver.findElement(By.xpath("//div[@class='as-metabox']/div[2]/div/span")).click();
        driver.findElement(By.xpath("//div[@class='as-metabox']/div[2]/div/span/span/span/span")).click();
        driver.findElement(By.xpath("//span[@class = 'select2-results']/ul[1]/li[2]")).click();
        //CheckBox2
        //driver.findElement(By.xpath("//input[@name='select-all-appointment[1]']")).click();
        //Time2
        driver.findElement(By.xpath("//*[@id=\'my-meta-box-activity\']/div/div/div[2]/div[2]/input[2]")).sendKeys("10;30 AM", Keys.ENTER);

        //DAYDROPDOWN 3
        driver.findElement(By.xpath("//div[@class='as-metabox']/div[3]/div/span/span/span/span")).click();
        driver.findElement(By.xpath("//span[@class = 'select2-results']/ul[1]/li[4]")).click();
        //CheckBox3
        //driver.findElement(By.xpath("//input[@name='select-all-appointment[2]']")).click();
        //Time3
        driver.findElement(By.xpath("//*[@id=\'my-meta-box-activity\']/div/div/div[3]/div[2]/input[2]")).sendKeys("02:30 PM", Keys.ENTER);
        
                                                     //APPOINMENT SCHEDULE DATES:
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='as-metabox-dt-add']/div[3]/div[1]/input[@type='text']")).sendKeys("2019-12-23",Keys.ENTER);
        
        //CheckBox
        //driver.findElement(By.xpath("//div[@class='as-metabox-dt-add']/div[3]/div[2]/input[@name='select-all-appointment-dt-add[2]']")).click();
        
        //TIME SELECTOR
        driver.findElement(By.xpath("//div[@class='as-metabox-dt-add']/div[3]/div[2]/input[2]")).sendKeys("10:45 PM",Keys.ENTER,"1:30 AM");
                
        //EXCLUDE APPOINMENT
        
        driver.findElement(By.xpath("//*[@class='as-metabox-dt-del']/div[2]/div[1]/input[@type='text']")).sendKeys("2019-12-23",Keys.ENTER);
        
        //Check-Box
        driver.findElement(By.xpath("//*[@class='as-metabox-dt-del']/div[2]/div[2]/input[@type='checkbox']")).click();
        Thread.sleep(3000);
        //Add Button
        driver.findElement(By.xpath("//*[@id=\'my-meta-box-activity-dt-del\']/div/div/div[9]/div[3]/a[@class='clone-dt-del']")).click();
        
        //Update
        //driver.findElement(By.xpath("//*[@id=\'publish\']")).click();
        
    }

}
