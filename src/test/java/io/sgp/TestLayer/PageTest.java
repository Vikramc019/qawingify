package io.sgp.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.sgp.PageLayer.HomePage;
import io.sgp.PageLayer.LoginPage;
import io.sgp.TestBased.TestBase;

public class PageTest extends TestBase
{
	
    @Test
	public void verifyLogin() throws InterruptedException
	{

		String expected_homepageUrl="https://sakshingp.github.io/assignment/home.html";
		
		
		String Check_Url1=login.getActualHomePageUrl();
		Assert.assertEquals(Check_Url1,expected_homepageUrl);
	}
    @Test
    public void verifyAmountSorted() throws InterruptedException 
    {
		
        home=new HomePage();
        home.clickOnAmountBtn();
        System.out.println("Values/Amount sorted in ascending order");
        Thread.sleep(5000);
        home.sortAmount();
        
        
}
    }
