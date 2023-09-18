import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFoxOne {

	public static void main(String[] args) throws Exception {
		//System.setProperty(“webdriver.gecko.driver”,”Path of the GeckoDriver file”).
		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		// get the url with get method
		driver.get("http://www.amazon.com");
		// I need to get the title of the window
//		String mess1=driver.getTitle();
//		System.out.println("The title of the website:"+mess1);
//		String pagesource = driver.getPageSource();
//		System.out.println("Print the pagesource:"+pagesource);
//		if (mess1.contains("Amazon"))
//		{
//			System.out.println("Title does not match");
//		}
//			else
//			{
//				System.out.println("Title matches");
//			}
		String url = driver.getCurrentUrl();
		String url1="http://www.oracle.com";
		System.out.println("Get the current url"+url);
		if (url.contains(url1))
		{
			System.out.println("Current matches");
		}
		else
		{
			System.out.println("Current url does not matches");
		}
		
	driver.quit();
	}
	
      
	}


