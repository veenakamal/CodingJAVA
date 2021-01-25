package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert(); //Switch between the window and Pop up
		System.out.println(alert.getText());
		String text = alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct message");
		}
		else {
			System.out.println("Wrong message");
		}
		alert.accept();
		driver.quit();
		//alert.dismiss();
		/*driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]")).sendKeys("Veena");
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]")).sendKeys("Devi");
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[2]")).click();
		//driver.findElement(By.xpath("//input[@id='radio_login']")).click();*/
	}

}
