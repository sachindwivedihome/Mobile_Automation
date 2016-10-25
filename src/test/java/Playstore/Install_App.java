package Playstore;

import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Install_App  extends Utility_Functions

{
			@Test()
			public void Install_App() throws Exception
			
			{
				System.out.println("done");
				getElement_AccesibilityId("Search").click();
				getElement_ByName("Search Google Play").sendKeys("es");
			}
}
