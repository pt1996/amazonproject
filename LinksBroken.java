package javaproject;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinksBroken {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver=new EdgeDriver();  // creating object to for  the edge browser
		driver.get("https://www.amazon.in/");  // to launch the browser
		driver.manage().window().maximize();    // maximize the screen
		// To find the links
		 List<WebElement> link=driver.findElements(By.tagName("a"));  // Here, we are identifying all links present in the website for that we are using findelements 
		 // To find the links count
		int link_count= link.size();  // finding total number of links present in the website
		System.out.println(link_count);
		//To Print the all links in text format
		for(int i=0;i<link.size();i++)   // to print the links using loop
		{
			     WebElement f=link.get(i);
			         // String s=f.getText();   // gettext is the method available in webelement to print the links in the form of text
			         // System.out.println(s);
			     // To print the links 
			        String h= f.getAttribute("href");  // getattribute is a method under webelement to find the links staring with #
			        System.out.println(h);
			        brokenProgram(h);
			        
			        
		}
	}
	// Broken Links
			public static void brokenProgram(String h) throws IOException
			{
				URL u=new URL(h);  // creating object for url 
				HttpsURLConnection c=(HttpsURLConnection) u.openConnection();
				      if(c.getResponseCode()==200)
				      {
				    	  System.out.println("Valid url:" +h);
				      }
				      else
				      {
				    	  
				    	  System.out.println("not valid url:" +h);
				      }
			}

}
