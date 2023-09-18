import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// get the url with get method
		driver.get("https://www.amazon.com");
		List<WebElement> obj1=driver.findElements(By.tagName("a"));
		int tag1=obj1.size();
		System.out.println("Number of links"+tag1);
		List<WebElement> obj2=driver.findElements(By.tagName("img"));
		int img1=obj2.size();
		System.out.println("Number of images"+img1);
		List<WebElement> obj3=driver.findElements(By.tagName("table"));
		int tables=obj3.size();
		System.out.println("Number of tables"+tables);
		List<WebElement> obj4=driver.findElements(By.xpath("src"));
		int herf1=obj4.size();
		System.out.println("Number of inner reference links"+herf1);
		driver.quit();

	}

}
