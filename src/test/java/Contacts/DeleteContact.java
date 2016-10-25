package Contacts;

import io.appium.java_client.android.AndroidElement;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class DeleteContact extends Utility_Functions
{
	@Test(enabled=true)
	public void dialNumber() throws InterruptedException
	{				
			String contactname = "NewContact";			
			Thread.sleep(2500);
			getElement_AccesibilityId("Search").click();
			
			getElement_ByName("Find contacts").sendKeys("new");
			
			Thread.sleep(2000);
			
			getElement_ByName(contactname).click();
			
			getElement_AccesibilityId("More options").click();
			getElement_ByName("Delete").click();
			getElement_ByName("OK").click();
			
			if(getElement_ByName("No contacts")==null)
			{
				Assert.assertTrue(false,"Contact is not deleted" );
			}
	}
}
