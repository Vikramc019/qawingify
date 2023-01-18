package io.sgp.TestBased;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.sgp.PageLayer.HomePage;
import io.sgp.PageLayer.LoginPage;

public class TestBase 
{
	public static WebDriver driver;
	public LoginPage login;
	public HomePage home;
	String browser="CHROME";
	
    @BeforeMethod
	public void setup() throws InterruptedException
	{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
		   WebDriverManager.firefoxdriver().setup();
		   driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else
		{
			System.out.println("Please select/Check the browser");
		}
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		login=new LoginPage();
		login.enterUsername();
		login.enterPassword();
		login.clickloginbtn();
		Thread.sleep(5000);
		
	}
	
    @AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
