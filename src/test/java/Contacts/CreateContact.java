package Contacts;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class CreateContact extends Utility_Functions
{
	@Test(enabled=true)
	public void dialNumber() throws InterruptedException
	{	
			getElement_Id("Create_New_Contact_Button").click();
//			getElement_ByName("Phone contact").click();
			List <WebElement> list = getElements_ClassName("Add_newContactsElements");
			
			list.get(0).click();
			list.get(0).sendKeys("NewContact");
			dr.hideKeyboard();
			
			list.get(1).click();		

			list.get(1).sendKeys("9871134905");
			dr.hideKeyboard();
			
			swipe(144,400,144,939,1000) ;
			list = getElements_ClassName("Add_newContactsElements");
			
			list.get(3).click();

			list.get(3).sendKeys("waarheads@gmail.com");
			dr.hideKeyboard();
			Thread.sleep(3000);
			
			getElement_AccesibilityId("Save").click();
						
			dr.navigate().back();
			
			AndroidElement newcontact =  getElement_UIScrollable("NewContact");
			
			if(newcontact==null)
			{
				Assert.assertTrue(false, "Newly created name not found");
			}
			
			newcontact.click();
			
			
			AndroidElement ContactName =  getElement_ByName("NewContact");
			
			AndroidElement ContactNumber = getElement_ByName("98711 34905");
			

			
			AndroidElement EmailAdress = getElement_ByName("waarheads@gmail.com");
			
				if((ContactNumber==null || ContactName==null)||  EmailAdress==null)
				{

					Assert.assertTrue(false, "Issue in contact creation");
				}
	}
}
