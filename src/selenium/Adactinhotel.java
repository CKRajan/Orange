package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hema\\Desktop\\seleium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		driver.findElement(By.id("username")).sendKeys("suriyasteyn123");
		driver.findElement(By.id("password")).sendKeys("ssssss");
		driver.findElement(By.id("login")).click();
	//	driver.getAttribute("");
		
		String username=driver.findElement(By.id("welcome_menu")).getAttribute("value");
		System.out.println ("The user name is" + username);


	//	Hello suriyasteyn123!  username_show
	}

}
