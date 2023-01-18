package io.sgp.PageLayer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.sgp.TestBased.TestBase;

public class HomePage extends TestBase
{
	//initillisation
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	//obj repo
	@FindBy(xpath="//th[@id=\"amount\"]")
	private WebElement amount_Btn;
	

	public void clickOnAmountBtn()
	{
		amount_Btn.click();
	}
	public void sortAmount()
	{
		ArrayList<String> obtainedList = new ArrayList<>(); 
		List<WebElement> elementList= driver.findElements(By.xpath("//td[@class='text-right bolder nowrap']"));
		for(WebElement we:elementList)
		{
		  String op = we.getText();
		  System.out.println("Obtain"+op);
		}
		
		
		
		
	}
	
	}

	
	
	
	
	


