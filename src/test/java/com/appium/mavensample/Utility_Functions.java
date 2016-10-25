package com.appium.mavensample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import io.appium.java_client.android.AndroidElement;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class Utility_Functions extends Before_After_Annotations
{	
	public static void openNotification() throws InterruptedException
	{
		dr.openNotifications();
		Thread.sleep(3500);
		System.out.println("one");
		dr.swipe(144,400,144,939,1000) ;
		Thread.sleep(5000);
		System.out.println("two");
	}
	
	public static AndroidElement getElement_UIScrollable(String text)
	{	
		try
		{	
			return  (AndroidElement) dr.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"); 
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_Id(String text)");
			return null;
		}
	}
	
	public static List<WebElement> getElements_UIScrollableList(String text)
	{	
		try
		{	
			return  dr.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))"); 
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_Id(String text)");
			return null;
		}
	}

	
	public static void swipe(int statr_x , int start_y , int end_x , int end_y , int duration)
	{
		dr.swipe(statr_x, start_y, end_x, end_y, duration) ; 
	}
	
	
	public static AndroidElement getElement_ByName(String name)
	{	
		try
		{
			return (AndroidElement) dr.findElementByName(name);
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_Id(String name)");
			return null;
		}
	}

	
	public static List<WebElement> getElements_ByName(String name)
	{	
		try
		{
			 List<WebElement> li =  dr.findElementsByName(name);
			 return li ; 
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_Id(String name)");
			return null;
		}
	}

	
	// Retrieving single element via id 
	public static AndroidElement getElement_Id(String resource_id)
	{	
		try
		{
			return (AndroidElement) dr.findElement(By.id(OR.getProperty(resource_id)));
					
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_Id(String resource_id)");
			return null;
		}
	}
				// Retrieving single element via Accessibility id 
	public static AndroidElement getElement_AccesibilityId(String accessibility_id)
	{	
		try
		{
			return  (AndroidElement) dr.findElementByAccessibilityId(accessibility_id);
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_AccesibilityId(String accessibility_id)");
			return null;
		}
	}
	// Retrieving multiple elements via id 

	public static List<WebElement>  getElements_Id(String resource_id)
	{	
		try
		{
			List<WebElement> li =  dr.findElements(By.id(OR.getProperty(resource_id)));
			return li ;
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElements_Id(String resource_id)");
			return null;
		}
	}
	
	// Retrieving multiple elements via class 
	public static List<WebElement>  getElements_ClassName(String class_name)
	{	
		try
		{
			
			
			List<WebElement> li =  dr.findElements(By.className(OR.getProperty(class_name)));
			return li ;
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElements_ClassName(String class_name)");
			return null;
		}
	}
	
	// Utility function for UIAutomator
	public static AndroidElement getElement_ByUI(String text)
	{	
		try
		{
			return (AndroidElement) dr.findElementByAndroidUIAutomator("UiSelector().text(\""+text+"\")");
		}
		catch(Exception e)
		{
			System.out.println("Catch block of getElement_ByUI(String text)");	
		}
		return null;
	}

	// getting suite names
	public static String[]  getSuiteName()
	{
		String suitePath=null;	
	      try {	
	         File inputFile = new File("C:\\Users\\Sachin\\Downloads\\Mobile_Automation-master\\Mobile_Automation-master\\testng.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	     
	         NodeList nList = doc.getElementsByTagName("suite-file");
	         
	         System.out.println("----------------------------");
	 
	            Node nNode = nList.item(suiteCount);
	            System.out.println("\nCurrent Element :"+ nNode.getNodeName());   
                Element eElement = (Element) nNode;
                suitePath = eElement.getAttribute("path");

                System.out.println(suitePath);
	 }
	      catch (Exception e) 
	      {
	         e.printStackTrace();
	      }
	      
	      if(suitePath.contains("Settings"))
	      					{
	    	  				String ar[] = new String[2];
	    	  		        ar[0]= "com.android.settings";
	    	  		        ar[1] ="com.android.settings.Settings";
	    	  		        return ar;
	      					}
	      if(suitePath.contains("Dialer"))
	      					{
	    	  				String ar[] = new String[2];
	    	  				ar[0]= "com.android.dialer";
	    	  				ar[1] ="com.android.dialer.DialtactsActivity";
	    	  				return ar;
	      					}
	      
	      if(suitePath.contains("Clock"))
							{
	    	  				String ar[] = new String[2];
	    	  				ar[0]= "com.android.deskclock";
	    	  				ar[1] ="com.android.deskclock.DeskClock";
	    	  				return ar;
							}
	      
	      if(suitePath.contains("Contacts"))
							{
	    	  				String ar[] = new String[2];
	    	  				ar[0]= "com.android.contacts";
	    	  				ar[1] ="com.android.contacts.activities.PeopleActivity";
	    	  				return ar;
							}
	      
	      if(suitePath.contains("SMS"))
	      					{
	    	  				String ar[] = new String[2];
	    	  				ar[0]= "com.android.mms";
	    	  				ar[1] ="com.android.mms.ui.ConversationList";
	    	  				return ar;
	      					}
	      
	      if(suitePath.contains("Playstore"))
			{
			String ar[] = new String[2];
			ar[0]= "com.android.vending";
			ar[1] ="com.google.android.finsky.activities.MainActivity";
			return ar;
			}

	      if(suitePath.contains("Gmail"))
			{
			String ar[] = new String[2];
			ar[0]= "com.google.android.gm";
			ar[1] ="com.google.android.gm.ComposeActivityGmail";
			return ar;
			}

	      
	      else return null; 
	   }
}