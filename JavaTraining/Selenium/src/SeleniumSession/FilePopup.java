package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePopup {
	//How to add File in the code, Window popup. When u click on "Browse" button, we need to upload the file

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		String Title = driver.getTitle();
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("F:\\AA_Practice\\readtext.txt");
		
		
		
	}

}
