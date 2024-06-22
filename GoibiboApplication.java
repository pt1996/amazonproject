package javaproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoibiboApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		s.click();
		WebElement value=driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]"));
		value.click();
		WebElement value2=driver.findElement(By.xpath("//input[@type='text']"));
		value2.sendKeys("Bangalore");
		Thread.sleep(3000);
		value2.sendKeys(Keys.ENTER);
	
		WebElement value3=driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[2]"));
		value3.click();
		Thread.sleep(3000);
		WebElement value4=driver.findElement(By.xpath("//input[@type='text']"));
		value4.sendKeys("new delhi");
		Thread.sleep(3000);
		value4.sendKeys(Keys.ENTER);
		
				
		
		

	}

}
