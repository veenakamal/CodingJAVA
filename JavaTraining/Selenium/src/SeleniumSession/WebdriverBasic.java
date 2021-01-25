package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasic {

	public static void main(String[] args) {
		//geckodriver to launch firefox
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		if(Title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.quit();

		
		
	}

}
