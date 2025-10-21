package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoveActionsExample {
	@Test
	public void MoveBallDemo() throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://training-support.net/webelements/drag-drop");
	Actions actions=new Actions(driver);
	//Thread.sleep(2000);t
	 WebElement ball = driver.findElement(By.id("ball"));
     WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
     WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
   
     actions.dragAndDrop(ball, dropZone1).pause(6000).dragAndDrop(ball, dropZone2).perform();
     Thread.sleep(1000);

     driver.quit();
	
	

}
}
