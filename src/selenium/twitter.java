package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class twitter {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver= new ChromeDriver();
		driver.get("//https://twitter.com/login/");
		driver.findElement(By.name("session[username_or_email]")).sendKeys("baskarramesh3@gmail.com");
		driver.findElement(By.name("session[password]")).sendKeys("9597416686");
		driver.findElement(By.id("LoginForm_Login_Button")).click();
	}
	

}
