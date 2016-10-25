package Settings;

import io.appium.java_client.android.AndroidElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class settingUp_Wifi extends Utility_Functions
{
	@Test(enabled=false)
	public void settingUp_Wifi () throws Exception
	{		
		List<WebElement> options2 =  getElements_Id("Settings_All_Option_Screen");  
		options2.get(0).click();	
		
		String  On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();
		if((On_Off_text.equals("Off")))
		{
		getElement_Id("Wifi_Toggle_Button").click();
		}
		
		Thread.sleep(5000);

		AndroidElement Pana_Testing = getElement_ByUI("Pana_Testing");	
		Pana_Testing.click();
		
		
		getElement_Id("Password_box").sendKeys("iuweybwef72894");	
		dr.hideKeyboard();
		getElement_Id("Connect_Button").click();
		
		Thread.sleep(10000);
	
		String Connected_Text = getElement_Id("Connected_Text").getText();
		System.out.println(Connected_Text);
		
		if(!(Connected_Text).equals("Connected"))
		{
		Assert.assertTrue(false,"Wifi is not getting enabled" );				
		}

		On_Off_text  = getElement_Id("Wifi_On_Off_Text").getText();

		if((On_Off_text.equals("On")))
		{
		System.out.println("Closing wifi");
		getElement_Id("Wifi_Toggle_Button").click();
		}
		
		On_Off_text  = getElement_Id("Wifi_On_Off_Text").getText();
		if((On_Off_text).equals("On"))
		{
			Assert.assertTrue(false,"Wifi is not getting disabled" );
		}
	}
}
