package step_definitions;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CommonPageObjects;
import pageobjects.SendEmailPageObjects;
import pageobjects.SendSMSpageObjects;

public class DragDropUIStepDef {
	public WebDriver driver;
	public CommonMethods commonMethods;
	Actions actions;

	public DragDropUIStepDef() throws MalformedURLException,IOException {
		driver = Hooks.driver;
		commonMethods = new CommonMethods(driver);
		actions = new Actions(driver);
		PageFactory.initElements(driver, CommonPageObjects.class);
		PageFactory.initElements(driver, SendSMSpageObjects.class);
		PageFactory.initElements(driver, SendEmailPageObjects.class);
	}
	
	@And("^I Click on Explore Investment Ideas for All Weather Strategy$")
	public void i_click_on_explore_investment_ideas_for_all_weather_strategy() throws Throwable {}

	@When("^Go to QuickFuseApps link$")
    public void go_to_quickfuseapps_link() throws Throwable {
		driver.get("http://quickfuseapps.com/");
		commonMethods.waitForPageToLoad();    }

    @Then("^I click on Lets get started$")
    public void i_click_on_lets_get_started() throws Throwable {
    	CommonPageObjects.letsGetStarted.click();
    }

    @Then("^I Fill out the Phone Number and text$")
    public void i_fill_out_the_phone_number_and_text() throws Throwable {
    	SendSMSpageObjects.phoneNumber.sendKeys("1234567890");
		SendSMSpageObjects.textMessage.get(0).sendKeys("Test Message");
		Point p = CommonPageObjects.receptor.get(0).getLocation();
		System.out.println(p.getX() + " " + p.getY());
    }

    @Then("^I Join all the open output ports of Send an Email to Exit app by dragging$")
    public void i_join_all_the_open_output_ports_of_send_an_email_to_exit_app_by_dragging() throws Throwable {
    	//Point p = CommonPageObjects.start.get(4).getLocation();
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CommonPageObjects.start.get(4));
    	actions.dragAndDropBy(CommonPageObjects.basicOptions.get(0),550,400).build().perform();
		Thread.sleep(3000);
		actions.dragAndDrop(CommonPageObjects.start.get(4), CommonPageObjects.receptor.get(3)).build().perform();
		Thread.sleep(1000);
		actions.dragAndDropBy(CommonPageObjects.basicOptions.get(0),1250,400).build().perform();
		Thread.sleep(3000);
		actions.dragAndDrop(CommonPageObjects.start.get(5), CommonPageObjects.receptor.get(4)).build().perform();
		Thread.sleep(1000);
    }

    @And("^I Click on Create App$")
    public void i_click_on_create_app() throws Throwable {
		CommonPageObjects.createApp.click();
		commonMethods.waitForPageToLoad();
    }

    @And("^I Create a new page with a name$")
    public void i_create_a_new_page_with_a_name() throws Throwable {
    	CommonPageObjects.addPage.click();
		CommonPageObjects.pageName.sendKeys("hello");
		CommonPageObjects.create.click();
    }

    @And("^I click on Messaging$")
    public void i_click_on_messaging() throws Throwable {
    	CommonPageObjects.messaing.click();
    	commonMethods.waitForVisibility(CommonPageObjects.messagingOptions.get(2));
		Thread.sleep(1000);
    }

    @And("^I drag component Send an SMS to the main app page join the line from start acting as connector$")
    public void i_drag_component_send_an_sms_to_the_main_app_page_join_the_line_from_start_acting_as_connector() throws Throwable {
    	actions.dragAndDrop(CommonPageObjects.messagingOptions.get(2), CommonPageObjects.droppableUI).build().perform();
    	commonMethods.waitForClickability(CommonPageObjects.droppedElement.get(1));
    	//Thread.sleep(3000);
		actions.dragAndDrop(CommonPageObjects.start.get(1), CommonPageObjects.receptor.get(0)).build().perform();
    }

    @And("^I drag component Send an Email from the left module and join line from Not sent output port$")
    public void i_drag_component_send_an_email_from_the_left_module_and_join_line_from_not_sent_output_port() throws Throwable {
    	actions.dragAndDropBy(CommonPageObjects.messagingOptions.get(1),800,350).build().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(CommonPageObjects.start.get(3), CommonPageObjects.receptor.get(1)).build().perform();
    }

    @And("^I Click on component Basic on left Module and drag Exit App to Sent output port of Sent sms box$")
    public void i_click_on_component_basic_on_left_module_and_drag_exit_app_to_sent_output_port_of_sent_sms_box() throws Throwable {
    	CommonPageObjects.basic.click();
    	Thread.sleep(2000);
    	actions.dragAndDropBy(CommonPageObjects.basicOptions.get(0),550,400).build().perform();
		Thread.sleep(2000);
		actions.dragAndDrop(CommonPageObjects.start.get(2), CommonPageObjects.receptor.get(2)).build().perform();
    }	
}
