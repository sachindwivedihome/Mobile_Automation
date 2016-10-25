package SMS;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Send_and_Receive_SMS extends Utility_Functions
{
		String str = "hello";
		@Test
		public void Send_and_Receive_SMS() throws Exception
		{
		getElement_AccesibilityId("New message").click();
		
		getElement_ByName("Type name or number").sendKeys("8527256127");
		getElement_ByName("Type text message").sendKeys(str);
		getElement_AccesibilityId("Send").click();
		
		dr.hideKeyboard();
		Thread.sleep(2000);
		
		List <WebElement> message_list= getElements_ByName(str);
		
		int size = message_list.size();
		
			if(size!=2)
			{
				Assert.assertTrue(false, "mesage not sent");	
			}
		
		}
}
