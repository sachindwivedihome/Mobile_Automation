package Settings;

import io.appium.java_client.android.AndroidElement;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Forgetting_Wifi_Password  extends Utility_Functions
{
	@Test(enabled=false)
	public void Forgetting_Wifi_Password () throws Exception
	{		
		List<WebElement> options2 =  getElements_Id("Settings_All_Option_Screen");  
		options2.get(0).click();	
		
		String  On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();
		if((On_Off_text.equals("Off")))
		{
		getElement_Id("Wifi_Toggle_Button").click();
		}
		
		Thread.sleep(4000);
		
		AndroidElement Pana_Product = getElement_ByUI("Pana_Product");	
		Pana_Product.click();

		
		getElement_Id("Password_box").sendKeys("pseventyseven");	
		dr.hideKeyboard();
		getElement_Id("Connect_Button").click();
		
		Thread.sleep(10000);
	
		String Connected_Text = getElement_Id("Connected_Text").getText();
		System.out.println(Connected_Text);
		
		if(!(Connected_Text).equals("Connected"))
		{
		Assert.assertTrue(false,"Wifi is not getting enabled" );				
		}

		Pana_Product.click();
		getElement_Id("Forget_Wifi_Button").click();
		
		
		Pana_Product.click();		
		AndroidElement Password_box = getElement_Id("Password_box");
		
		if(Password_box==null)
		{
			System.out.println("Issue in password forgetting");
		}
	}
}
