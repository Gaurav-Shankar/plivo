package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public static WebDriver driver;
	@Before
	public static void openBrowser() throws MalformedURLException {
		String os = System.getProperty("os.name");
		if(os.contains("Linux"))
			System.setProperty("webdriver.chrome.driver", "libs//chromedriver2");
		else if(os.contains("Mac"))
			System.setProperty("webdriver.chrome.driver", "libs//chromedriver");
		driver = new ChromeDriver();
	}
	
	@After
	public void cloaseBrowserWindow() {
		driver.quit();
	}
}