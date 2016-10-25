package Gmail;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class GmailSignIn extends Utility_Functions
{
			@Test()
			public void GmailSignIn()
			{
				WebDriver driver  = new WebDriver(); 
				WebDriverWait wait = new WebDriverWait(driver,20);
				
				getElement_ByName("Skip").click();
				getElement_ByName("Add an email address").click();
				getElement_ByName("Google").click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headingText")));
		//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.);
				getElement_AccesibilityId("Email or phone number").click();
				
			}
}
