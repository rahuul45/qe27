package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetDemo {
	
	@Test
	public void MoveByOffset() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/drag-drop");
		 WebElement ball = driver.findElement(By.id("ball"));
	     WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
	     WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
	     
	     int widthOfTargetOne = dropZone1.getLocation().getX();
			int heightOfTargetOne = dropZone1.getLocation().getY();
			int ballWidth = ball.getLocation().getX();
			int ballHeight = ball.getLocation().getY();
			
			int widthOffSetX = widthOfTargetOne - ballWidth;
			int heightOffSetY = heightOfTargetOne - ballHeight;
			
			Thread.sleep(1000);
			int widthfinalx=dropZone2.getLocation().getX();
			int heightfinaly=dropZone2.getLocation().getY();
			
			int widthOffsetX1=widthfinalx-widthOfTargetOne;
			int heightOffSetY1=heightfinaly-heightOfTargetOne;
			Thread.sleep(1000);
	     
		Actions actions=new Actions(driver);
		actions.clickAndHold(ball).moveByOffset(widthOffSetX, heightOffSetY).moveByOffset(widthOffsetX1,heightOffSetY1).release().perform();
	}

}
