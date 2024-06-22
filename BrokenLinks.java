package javaproject;


import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>  list=driver.findElements(By.tagName("a"));
		int count=list.size();
		System.out.println(count);
		for(int i=0;i<=list.size()-1;i++)
		{
			        WebElement a=   list.get(i);
			                  String url=  a.getAttribute("href");
			                  System.out.println(url);
			                  
		}

	}
	static void link_validation(String url)
	{
		URL url=new URL(url);
	}

}
