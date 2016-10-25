package Settings;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class LaunchingWifi_FromNotificationPanel  extends Utility_Functions
	{
	@Test(enabled=false)
	public void LaunchingWifi_FromNotificationPanel () throws Exception
	{		
		openNotification();

		Thread.sleep(4000);

		List<WebElement> li2 =  getElements_ClassName("Android.Widget.ImageView");
		System.out.println("list2  size "+li2.size());		
		li2.get(2).click();
	
		dr.findElementById("android:id/button1").click();
		Thread.sleep(3000);
		
		List<WebElement> li3 = getElements_ClassName("Android.Widget.TextView");
		
		System.out.println("list size 3 "+li3.size());
		
			for(int i=0;i<li3.size();i++)
				{
				System.out.println(li3.get(i).getText());
				}
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
				
				List<WebElement> options2 =  getElements_Id("Settings_All_Option_Screen");  
				options2.get(0).click();		
		
				String  On_Off_text = getElement_Id("Wifi_On_Off_Text").getText();

				if((On_Off_text).equals("Off"))
				{
					Assert.assertTrue(false,"Wifi is not getting enabled" );	
				}
			}
		
		}
	
