
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 {

    public static void main(String[] args) {

            WebDriver driver = new FirefoxDriver();

            driver.manage().window().maximize();

            String url = "https://cloud.synchro.com";

            WebDriverWait wait=new WebDriverWait(driver, 20);         
            driver.findElement(By.xpath("//Username']")).sendKeys("Login");             
            driver.findElement(By.xpath("//password']")).sendKeys("Password");             
            driver.findElement(By.xpath("//Login']")).click(); 

    }  

}