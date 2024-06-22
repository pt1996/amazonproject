package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class flipkart {
              static WebDriver driver;
             public static void main(String[] args)
             
             {
            	 driver=new EdgeDriver();
            	 driver.get("https://www.flipkart.com/");
            	 driver.manage().window().maximize();
            	 WebElement searchbar=driver.findElement(By.name("q"));
            	 searchbar.sendKeys("Mobiles");
            	 List<WebElement> sugg=driver.findElements(By.xpath("(//ul[@class='_1sFryS _2x2Mmc _3ofZy1'])/li[4]"));
            	 int length=sugg.size();
            	 System.out.println(length);
            	 int count=sugg.size()-4;
            	
            	 
            	 
            	 
            	 
             }
}
