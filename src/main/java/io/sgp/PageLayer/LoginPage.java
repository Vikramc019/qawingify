package io.sgp.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.sgp.TestBased.TestBase;

public class LoginPage extends TestBase
{
	//Initillisation
	public LoginPage()                           
	{
		PageFactory.initElements(driver,this);
	}
	
	//object repo
	@FindBy(xpath="//input[@id=\"username\"]")
	private WebElement un_txtbox;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	private WebElement pw_txtbox;
	
	@FindBy(xpath="//button[@id=\"log-in\"]")
	private WebElement login_btn; 
	
/*	public String getActualLoginPageUrl() 
	{
		String actual_loginpageUrl=driver.getCurrentUrl();
		return actual_loginpageUrl;
	}*/
	
	public void enterUsername()
	{
		un_txtbox.sendKeys("Admin");
	}
	public void enterPassword()
	{
		pw_txtbox.sendKeys("Test@123");
	}
	
	public void clickloginbtn()
	{
		login_btn.click();
	}
	
	public String getActualHomePageUrl()
	{
		String actual_homepageUrl1=driver.getCurrentUrl();
		return actual_homepageUrl1;
	}
}
