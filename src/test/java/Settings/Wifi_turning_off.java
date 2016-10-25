package Settings;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Wifi_turning_off extends Utility_Functions
{
	@Test(enabled=false)
	public void wifi_Turning_Off() throws Exception
	{		
		List<WebElement> options2 =  getElements_Id("Settings_All_Option_Screen");
		options2.get(0).click();
		String  On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();
		if((On_Off_text.equals("On")))
				{
				getElement_Id("Wifi_Toggle_Button").click();
				}
		On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();
		if((On_Off_text).equals("On"))
		{
			Assert.assertTrue(false,"Wifi is not getting disabled" );
		}
	}

}
