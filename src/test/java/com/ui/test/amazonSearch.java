package com.ui.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class amazonSearch {
	
	public String driverPath = "/home/rkotha/Documents/drivers/";
	public WebDriver driver;
	@BeforeClass
	public void setUpDriver(){
		System.setProperty("webdriver.gecko.driver",driverPath+"geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
  @Test
  public void searchItem() {
	  driver.navigate().to("http://www.amazon.in/");
	  System.out.println(driver.getTitle());
  }
}
