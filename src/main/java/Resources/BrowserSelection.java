package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSelection {

	
	public static  WebDriver Driver;
	public static  Properties prop;
	public static WebDriver InitiateBrowser() throws IOException 
	{
		
		prop = new Properties();
		FileInputStream File = new FileInputStream("C:\\Users\\Ashu\\git\\goibibo\\src\\main\\java\\Resources\\GlobalParameters.properties");
		prop.load(File);
		String BrowserName= prop.getProperty("Browser");
		if(BrowserName.contentEquals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "‪D:\\ChromeDriver\\chromedriver.exe");
			Driver = new ChromeDriver();
		}
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return Driver;
		
	}

}
