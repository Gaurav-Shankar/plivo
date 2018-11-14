package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPageObjects extends BaseClass{

	public CommonPageObjects(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.ID, using="link-create")
	public static WebElement createApp;	
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),\"Let's get started!\")]")
	public static WebElement letsGetStarted;
	
	@FindBy(how=How.ID, using="add-page")
	public static WebElement addPage;
	
	@FindBy(how=How.XPATH, using="//form[@class='unsubmittable']//input[@name='name']")
	public static WebElement pageName;

	@FindBy(how=How.XPATH, using="(//button[text()='Create'])[2]")
	public static WebElement create;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Messaging')]")
	public static WebElement messaing;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Basic')]")
	public static WebElement basic;
	
	@FindBy(how=How.XPATH, using="//ul//li[@class='module-item ui-widget-content ui-corner-all module-item-green ui-draggable']")
	public static List<WebElement> messagingOptions;
	
	@FindBy(how=How.XPATH, using="//div[@class='ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active']//ul//li")
	public static List<WebElement> basicOptions;
	
	@FindBy(how=How.ID,using="tabs-2")
	public static WebElement droppableUI;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id,'node-')]")
	public static List<WebElement> start;
	
	@FindBy(how=How.XPATH, using="//div[contains(@id,'rec-')]")
	public static List<WebElement> receptor;
	
	@FindBy(how=How.XPATH, using="//div[@class='panel']")
	public static List<WebElement> droppedElement;
	
}
