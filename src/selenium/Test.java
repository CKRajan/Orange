package selenium;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hema\\Desktop\\seleium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
Set<String> Allwindows =driver.getWindowHandles();
int val=Allwindows.size();
System.out.println(val);
for(String window:Allwindows)
{
driver.switchTo().window(window);
if(!window.equals(parent))
{
	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a")).click();
}
	
}
	
	
	}

}
