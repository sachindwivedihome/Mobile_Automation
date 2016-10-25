package Clock;

import io.appium.java_client.android.AndroidElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class Setting_alarm extends Utility_Functions
{
			@Test
			public void setting_alarm() throws InterruptedException
			{
				int alarmtime;
				List<WebElement> Clock_options = getElements_ClassName("Clock_options");
				Clock_options.get(0).click();
				getElement_Id("Adding_Alarm").click();
				
				int hrnInt , minInt;
				String hr,min; 
				hr = getElement_Id("Hours_id").getText() ; 
				min = getElement_Id("Minutes_id").getText();
				
				hrnInt=Integer.parseInt(hr);
				minInt= Integer.parseInt(min);
				
				getElement_Id("Minutes_id").click();
				
		//		List<WebElement> Radial_Time_List = getElements_ClassName("Radial_Time");
		//		System.out.println(Radial_Time_List.size());
					
				List <WebElement> abc = dr.findElementsByClassName("android.widget.RadialTimePickerView$RadialPickerTouchHelper");
	
				System.out.println(abc.size());
				
				abc.get(5).click();
			
			}
}