package com.cognizant.selenium;

import java.time.Duration;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsThree {
	@Test
	public void ThreeWindows() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/tab-opener");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println("Title of the Page: "+driver.getTitle());
		driver.findElement(By.id("launcher")).click();
		System.out.println("ParentWindow: "+driver.getWindowHandle());
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Windows: "+driver.getWindowHandles());
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
		System.out.println("ChildWindow: "+driver.getWindowHandle());
		driver.findElement(By.id("actionButton")).click();
		System.out.println("WindowsTotal: "+driver.getWindowHandles());
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		
		
	}

}
