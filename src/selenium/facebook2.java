package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "c:\\Users\\Hema\\Desktop\\seleium\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.findElement(By.id("email")).sendKeys("9688509678");
   driver.findElement(By.id("pass")).sendKeys("surejps");
   driver.findElement(By.id("loginbutton")).click();
   
	}

}

