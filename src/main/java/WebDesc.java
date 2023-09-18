import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDesc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// get the url with get method
		driver.get("https://www.amazon.com");
		List<WebElement> obj1=driver.findElements(By.tagName("img"));
		int tag1=obj1.size();
		System.out.println("Number of links"+tag1);
		for(WebElement el1:obj1)
		{
			System.out.println(el1.getAttribute("src"));
			
		}
		

	}

}
