package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendEmailPageObjects extends BaseClass{

	public SendEmailPageObjects(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.NAME, using="smtp_url")
	public static WebElement smtpHost;
	
	@FindBy(how=How.NAME, using="port")
	public static WebElement port;
	
	@FindBy(how=How.XPATH, using="//div[@class='left']//input[@name='username']")
	public static WebElement username;
	
	@FindBy(how=How.XPATH, using="//div[@class='left']//input[@name='password']")
	public static WebElement password;
	
	@FindBy(how=How.NAME, using="from_constant")
	public static WebElement from;
	
	@FindBy(how=How.NAME, using="to_constant")
	public static WebElement to;
	
	@FindBy(how=How.NAME, using="subject_constant")
	public static WebElement subject;
	
	@FindBy(how=How.NAME, using="cc_constant")
	public static WebElement cc;
}
