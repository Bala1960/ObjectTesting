import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

	@Test
	public void OpenAmazon()
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//Creating an object of ChromeDriver
	WebDriver driver = new ChromeDriver();
	// maximize the window
	driver.manage().window().maximize();
	// get the url with get method
	driver.get("http://www.amazon.com");
	// I need to get the title of the window
	String mess1=driver.getTitle();
	System.out.println("The title of the website:"+mess1);
	assertEquals(mess1,"Oralce webSite");
	String url = driver.getCurrentUrl();
	String url1="http://www.amazon.com";
	System.out.println("Get the current url"+url);
	// using assertEquals method from TestNG
//	assertEquals(url,url1);
	driver.quit();
	}
	@Test
	public void FireFoxOne()
	{System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\Dell\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	//Creating an object of ChromeDriver
	WebDriver driver = new FirefoxDriver();
	// maximize the window
	driver.manage().window().maximize();
	// get the url with get method
	driver.get("http://www.amazon.com");
	// I need to get the title of the window
	String mess1=driver.getTitle();
	assertEquals(mess1,"Amazontitle");
	driver.quit();
	}
	@Test
	public void EdgeBrowser()
	// C:\Users\Dell\Downloads\edgedriver_win64\msedgedriver.exe
	{System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Dell\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	//Creating an object of ChromeDriver
	WebDriver driver = new EdgeDriver();
	// maximize the window
	driver.manage().window().maximize();
	// get the url with get method
	driver.get("http://www.amazon.com");
	// I need to get the title of the window
	String mess1=driver.getTitle();
	assertEquals(mess1,"Amazontitle");
	

}
}


