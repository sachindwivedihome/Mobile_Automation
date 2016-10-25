package Dialer;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class TurnignOn_FlightMode_NotificatioPanel extends Utility_Functions

{
	@Test(enabled=false)
	public void TurningOn_FlightMode_NotificatioPanel () throws Exception
	{		
		openNotification();

		Thread.sleep(4000);

		List<WebElement> li2 =  getElements_ClassName("Android.Widget.ImageView");
		System.out.println("list2  size "+li2.size());		
		li2.get(6).click();
			
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
			
			getElement_ByName("OK").click();
		
			swipe(144,939,144,200,1000);
			Thread.sleep(3000);
			swipe(144,939,144,200,1000);
						
			getElement_Id("Keypad_button").click();
			getElement_Id("Digit_Space").sendKeys("98711 34905");
			getElement_Id("Call_button").click();
			
			AndroidElement airplane_alert = getElement_Id("alert_box_id");
						
			Assert.assertEquals("Airplane mode on", airplane_alert.getText());
	}
}