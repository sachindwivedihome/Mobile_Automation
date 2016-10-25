package Contacts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.mavensample.Utility_Functions;

public class SearchContact extends Utility_Functions
{
	static int a=0;
	@Test(enabled=true)
	public void dialNumber() throws InterruptedException
	{			
		int k = 0 ;
			String contactname = "ra";			
			Thread.sleep(2500);
			getElement_AccesibilityId("Search").click();
			getElement_ByName("Find contacts").sendKeys(contactname);
			
			dr.hideKeyboard();
			List<WebElement> contact_suggestion_list = getElements_Id("contact_suggestion_list");
			
			System.out.println("size list "+contact_suggestion_list.size());
			
			String arr[]=new String[40];
			
			for(int i=0;i<contact_suggestion_list.size();i++)
			{
							if(contact_suggestion_list.get(i).getText().startsWith("Ra"))
							{
							arr[a] = contact_suggestion_list.get(i).getText() ;
							System.out.println(arr[a]);
							a++;
							}
					
							else if(contact_suggestion_list.get(i).getText().startsWith("ra"))
							{
							arr[a] = contact_suggestion_list.get(i).getText() ;
							System.out.println(arr[a]);
							a++;
							}
					
							else 
							{
							String[] words=contact_suggestion_list.get(i).getText().split("\\s"); 
						
							for(String w:words)
							{  
							int flag1 = 0 ;
							arr[a]=w;
												
														if(w.startsWith("Ra"))
														{
															System.out.println("in Ra");
																flag1++;
														}
														
														else
															if(w.startsWith("ra"))
															{
																System.out.println("In ra");
																flag1++;
															} 
															
									if(flag1==1)
									{
										System.out.println("in break");
										k = 1;
										break ; 
									}
							
							
							System.out.println(w);
							a++;
						}

					}					
							if(k==0)
							{
								Assert.assertTrue(false, "Issue with searching name");
							}
			}

	}
}