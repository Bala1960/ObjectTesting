import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonlinkOne  {
	//*[@id="content"]/div[2]/a
	@Test
	public void GetLink() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//Creating an object of ChromeDriver
	WebDriver driver = new ChromeDriver();
	// maximize the window
	driver.manage().window().maximize();
	// get the url with get method
	driver.get("https://www.facebook.com");
	// I need to get the title of the window
	Thread.sleep(1000);
	WebElement el1 = driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a"));
	el1.click();
//	driver.quit();
	}

}
