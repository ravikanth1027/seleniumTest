package com.rerun.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRerun {
	public String driverPath = "/home/rkotha/Documents/drivers/";
	public WebDriver driver;
	
  @Test(retryAnalyzer=Retry.class)
  public void reRunTest() {
	  System.setProperty("webdriver.firefox.marionette",driverPath+"geckodriver");
	  DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  capabilities.setCapability("marionette",true);
	  driver = new FirefoxDriver(capabilities);
	  driver.manage().window().maximize();
	  
      driver.manage().window().maximize();

      driver.get("http://www.learn-automation.com");



   // Here we are verifying that title contains QTP or not. This test will fail because title does not contain QTP

      Assert.assertTrue(driver.getTitle().contains("QTP"));
  }
}
