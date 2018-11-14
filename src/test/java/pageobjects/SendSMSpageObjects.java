package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SendSMSpageObjects extends BaseClass{
	
	public SendSMSpageObjects(WebDriver driver) {
		super(driver);
	}
	
	//Phone Number Text Box
	@FindBy(how=How.NAME, using="phone_constant")
	public static WebElement phoneNumber;
	
	//Message Text Box
	@FindBy(how=How.NAME,using="message_phrase[]")
	public static List<WebElement> textMessage;
}
