package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	@Test
//	public void CopyAndPasteDemo() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://training-support.net/webelements/dynamic-attributes");
//		driver.manage().window().maximize();
//		WebElement nameField=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
//		nameField.sendKeys("Rahul");
//		nameField.sendKeys(Keys.CONTROL,"a");
//		nameField.sendKeys(Keys.CONTROL,"c");
//		WebElement emailField=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
//		emailField.sendKeys(Keys.CONTROL,"v");
//		
//		
//		nameField.sendKeys(Keys.CONTROL,"a");
//		nameField.sendKeys(Keys.BACK_SPACE);
//        WebElement detailsField=driver.findElement(By.xpath("//textarea[@name='db8d-additional-details-e839']"));
//        detailsField.sendKeys(Keys.CONTROL,"v");
//	}
	
	public void CopyAndPasteDemo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		driver.manage().window().maximize();
		WebElement nameField=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		nameField.sendKeys("Rahul");
		WebElement emailField=driver.findElement(By.xpath("//textarea"));
	// buttn=driver.findElement(By.xpath("//button[text()='Submit']"));
		
		Actions actions=new Actions(driver);
		actions.keyDown(nameField,Keys.CONTROL)
		  .sendKeys("a")
		  .sendKeys("c")
		  .keyUp(Keys.CONTROL)
		  .perform();
		actions.keyDown(emailField,Keys.CONTROL)
		   .sendKeys("v")
		   .keyUp(Keys.CONTROL)
		   
		   .perform();
		   
		  
		
		
	}
	

}
