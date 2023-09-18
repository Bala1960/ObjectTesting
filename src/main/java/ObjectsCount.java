import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	//*[@id="reg_pages_msg"]/a
	//*[@id="u_0_2_eP"]/div[2]/a
//*[@id="day"]
public class ObjectsCount {
	@Test
	public void Totalcount() throws Exception	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//Creating an object of ChromeDriver
	WebDriver driver = new ChromeDriver();
	// maximize the window
	driver.manage().window().maximize();
	// get the url with get method
	driver.get("https://www.facebook.com");
	WebElement text1=driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a"));
	Thread.sleep(1000);
	text1.click();
	WebElement text2=driver.findElement(By.xpath
			("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a"));
	text2.click();
	Thread.sleep(1000);
	List<WebElement> counts = driver.findElements(By.xpath("//input[@type='radio']"));
	int var1 = counts.size();
	System.out.println("count the number of radio buttons"+var1);
	List<WebElement> counts1 = driver.findElements(By.xpath("//input[@type='text']"));
	int var2 = counts1.size();
	System.out.println("count the number of text boxes"+var2);
	List<WebElement> counts2 = driver.findElements(By.xpath("//Select"));
	int var3= counts2.size();
	System.out.println("count the number of text boxes"+var3);
	driver.quit();
	}
	
}
