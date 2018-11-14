package step_definitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonMethods {
	WebDriver driver;
	
	public CommonMethods(WebDriver driver) throws IOException{
		this.driver = driver;
	}
	
	public void waitForPageToLoad() {
		String pageLoadStatus;
		JavascriptExecutor js;
		do {
			js = (JavascriptExecutor) driver;
			pageLoadStatus = (String) js.executeScript("return document.readyState");
		} while ( !pageLoadStatus.equals("complete") );
	}
	
	public boolean waitForVisibility(WebElement targetElement) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, 45);
			wait.until(ExpectedConditions.visibilityOf(targetElement));
			return true;
		}
		catch(TimeoutException e ){
			throw new TimeoutException();
		}
	}
	
	public boolean waitForInVisibility(By targetElement) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, 45);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(targetElement));
			return true;
		}
		catch(TimeoutException e ){
			throw new TimeoutException();
		}
	}
	
	public boolean waitForClickability(WebElement targetElement) {
		try{
			WebDriverWait wait = new WebDriverWait(driver, 45);
			wait.until(ExpectedConditions.elementToBeClickable(targetElement));
			return true;
		}
		catch(TimeoutException e ){
			throw new TimeoutException();
		}
	}
}
