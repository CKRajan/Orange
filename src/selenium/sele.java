package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sele{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hema\\Desktop\\seleium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("suriyasteyn123");
		driver.findElement(By.id("password")).sendKeys("ssssss");
		driver.findElement(By.name("login")).click();
		
	//	driver.getAttribute("");
		
		String username=driver.findElement(By.id("username_show")).getAttribute("value");
		System.out.println ("The user name is" + username);
		
		//driver.close();
//String title=driver.getTitle();
//System.out.println ("The title is" + title);

//driver.navigate().back();

//Alert al=driver.switchTo().alert();
//System.out.println (al.getText());

	//	location  New York		
		
		WebElement element=driver.findElement(By.id("location"));
		
		Select obj=new Select(element);
		obj.selectByValue("New York");
		
		Select obj1=new Select(driver.findElement(By.id("hotels")));
		obj1.selectByValue("Hotel Sunshine");
		
		Select obj2=new Select(driver.findElement(By.id("room_type")));
		obj2.selectByValue("Super Deluxe");
		
		Select obj3=new Select(driver.findElement(By.id("room_nos")));
		obj3.selectByValue("3");
		
		Select obj4=new Select(driver.findElement(By.id("adult_room")));
		obj4.selectByValue("4");
		
		Select obj5=new Select(driver.findElement(By.id("child_room")));
		obj5.selectByValue("2");
		
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		//Thread.sleep(3000);

		
		driver.findElement(By.id("first_name")).sendKeys("Suresh");
		driver.findElement(By.id("last_name")).sendKeys("Kumar");
		driver.findElement(By.id("address")).sendKeys("8,nehru st,salem");
		driver.findElement(By.id("cc_num")).sendKeys("123456789");
		driver.findElement(By.id("cc_num")).sendKeys("123456789");
		
		Select obj6=new Select(driver.findElement(By.id("cc_type")));
		obj6.selectByValue("MAST");
		
		Select obj7=new Select(driver.findElement(By.id("cc_exp_month")));
		obj7.selectByValue("6");
		
		Select obj8=new Select(driver.findElement(By.id("cc_exp_year")));
		obj8.selectByValue("2018");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		driver.findElement(By.id("book_now")).click();
	
		
	//	Thread.sleep(3000);

	/*	WebElement ele1=driver.findElement(By.xpath("//*[@id=\"order_no\"]"));
		Thread.sleep(3000);
		String val=ele1.getAttribute("value");
		System.out.println (val); */

		driver.manage().window().maximize();
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));

		String ordr=driver.findElement(By.id("order_no")).getAttribute("value");   
	    System.out.println ("The order no is" + ordr);

	    //Scroll down
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1200)");
	//    WebElement ele=driver.findElement(By.id("order_no"));
	  //  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	    
	    //SCREENSHOT
	    TakesScreenshot tk=(TakesScreenshot) driver;
	    File f1=tk.getScreenshotAs(OutputType.FILE);
	    File f2=new File("F:\\seleium\\snap123.jpg");
	    FileHandler.copy(f1, f2);
	    
	    
		//W647E5HF6A
	//	WebElement ele=obj.getFirstSelectedOption();
	//	System.out.println (ele.getText());

	//	System.out.println (obj.isMultiple());
		
	//	List <WebElement> list =obj.getOptions();
		
	/*	for(WebElement a: list) {
			System.out.println (a.getText());
	
		}
*/
		

		

	}

}
