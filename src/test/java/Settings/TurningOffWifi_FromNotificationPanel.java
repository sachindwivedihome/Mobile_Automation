package Settings;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class TurningOffWifi_FromNotificationPanel extends Utility_Functions
{
	@Test(enabled=false)
	public void TurningOffWifi_FromNotificationPanel () throws Exception
	{		
		openNotification();

		Thread.sleep(4000);

		List<WebElement> li2 =  getElements_ClassName("Android.Widget.ImageView");
		System.out.println("list2  size "+li2.size());		
		li2.get(2).click();
			
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
				
				List<WebElement> options2 =  getElements_Id("Settings_All_Option_Screen");  
				options2.get(0).click();		
		
				String  On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();
				
				if((On_Off_text).equals("On"))
				{
					Assert.assertTrue(false,"Wifi is not getting disabled" );
				}
			}
		
		}
