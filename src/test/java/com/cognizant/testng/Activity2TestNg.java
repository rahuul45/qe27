package com.cognizant.testng;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity2TestNg {
	WebDriver driver;
	@Test
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");	
	}
	
	@Test(dependsOnMethods= {"openBrowser"})
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
	}
	@Test(dependsOnMethods= {"login"})
	public void getLoginSuccessMessage()  {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
		    String msg = messageElement.getText();
		Assert.assertEquals(msg, "Welcome Back, Admin!");
		
	}
	

}
