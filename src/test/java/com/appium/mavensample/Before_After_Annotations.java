package com.appium.mavensample;

import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Before_After_Annotations extends Initialize
{		
	static String activityName = null;
	static String packageName = null; 
	@BeforeSuite
	public void beforeSuite() throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Nexus 5");
		cap.setCapability("platformVersion", "6.0.1");
		cap.setCapability("platformName", "Android");
									
		String[] app = Utility_Functions.getSuiteName();
		
		System.out.println("****************"+app[0]+"****************");

		
		activityName=app[0]; 
		packageName=app[1];

			
			cap.setCapability("appPackage",activityName);
			cap.setCapability("appActivity",packageName);
			dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
			
			
	}
	@BeforeTest
	public static void beforetest() throws Exception
	{
		{
			
			OR = new Properties();	
			FileInputStream  fn = new FileInputStream(System.getProperty("user.dir")+"//src//test//java//config/OR.properties"); 
			OR.load(fn); 
			dr.startActivity(activityName, packageName);
		} 		
	}
	@AfterSuite
	public void afterSuite() throws InterruptedException
	{
		if(dr!=null)
		{
		suiteCount++;
		Thread.sleep(5000);
		dr.quit();
		}
	}
}