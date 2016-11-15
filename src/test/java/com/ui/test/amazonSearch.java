package com.ui.test;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazonSearch {
	
	public String driverPath = "/home/rkotha/Documents/drivers/";
	public WebDriver driver;
	@BeforeClass
	public void setUpDriver(){
		System.setProperty("webdriver.firefox.marionette",driverPath+"geckodriver");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
	}
//  @Test
//  public void searchItem() {
//	  driver.navigate().to("http://www.amazon.in/");
//	  System.out.println(driver.getTitle());
//  }
  
  @Test
  public void CheckImage(){
	  driver.get("http://www.testingdiaries.com/selenium-verify-image-present-webdriver/");
	  WebElement image = driver.findElement(By.xpath("//*[@id='post-1147']/div[1]/div/p[1]/a/img"));
	  Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", image);
	  
	  if(!ImagePresent){
		  System.out.println("Not Ther");
		
	  }
	  else{
		  System.out.println("Its There");
	  }
  }
  
  @AfterClass
  public void closeTest(){
	  driver.close();
	  System.out.println("End OF test");
  }
}
