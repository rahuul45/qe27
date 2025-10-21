package com.cognizant.selenium;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MultipleWindows {
	@Test
	public void multipleWindowsDemo() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement inputBar=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		inputBar.sendKeys("watches");
		inputBar.sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='_53J4C-'])[1]"))).click();
		String parentWin=driver.getWindowHandle();
		System.out.println(parentWin);
       
        Set<String> handles=driver.getWindowHandles();
        for(String handle :handles) {
        	if(!handle.equals(parentWin)) {
        		driver.switchTo().window(handle);
        		Thread.sleep(1000);
        		System.out.println(handle);
        		break;
        	}
        }
        System.out.println(driver.getTitle());
        
		
	}
	

}
