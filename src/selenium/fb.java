package selenium;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class fb {

		public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hema\\Desktop\\seleium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("8940526046");
			driver.findElement(By.id("pass")).sendKeys("9597416686");
			driver.findElement(By.id("loginbutton")).click();

}
}