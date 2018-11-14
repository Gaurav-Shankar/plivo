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
		System.setProperty("webdriver.chrome.driver", "libs//chromedriver");
		driver = new ChromeDriver();
	}
	
	@After
	public void cloaseBrowserWindow() {
		driver.quit();
	}
}