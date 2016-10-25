package Dialer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Dialling_number extends Utility_Functions
{
		@Test(enabled=false)
		public void dialNumber() throws InterruptedException
		{
		getElement_Id("Keypad_button").click();
		getElement_Id("Digit_Space").sendKeys("98711 34905");
		getElement_Id("Call_button").click();
		Thread.sleep(6000);

		if(!((getElement_Id("Dialing_Text").getText()).equals("Dialing")))
			{
				Assert.assertTrue(false, "Errrors in dialing");
			}		
		System.out.println(getElement_Id("Dialed_Number").getText());
	
		if(!((getElement_Id("Dialed_Number").getText()).equals("98711 34905")))
		{
			Assert.assertTrue(false, "Errors in dialing");
		}
			Thread.sleep(5000);
			getElement_Id("EndCall_Button").click();	
			// end button click issue
		}
}