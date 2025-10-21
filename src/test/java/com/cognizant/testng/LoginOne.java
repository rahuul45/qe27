//package com.cognizant.testng;
//
//
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//
//import org.testng.annotations.Test;
//
//public class LoginOne extends BaseClass {
//	@BeforeClass
//	public void setup() {
//	
//		driver.get("https://training-support.net/webelements/login-form");
//		System.out.println("LoginOne");
//	}
//	
//	
//	@Test
//	public void loginexample() {	
//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
//	driver.findElement(By.xpath("//button[text()='Submit']")).click();
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h2"), "Welcome Back, Admin!"));
//	
//	String targetResult=driver.findElement(By.tagName("h2")).getText();
//	Assert.assertEquals(targetResult, "Welcome Back, Admin!");
//	
//	
//}
//}
