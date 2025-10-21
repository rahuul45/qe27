//package com.cognizant.testng;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class LoginTwo extends BaseClass{
//	
//	@BeforeClass
//	public void setup() {
//	
//		driver.get("https://training-support.net/webelements/login-form");
//		System.out.println("LoginTwo");
//	}
//	
//  @Test
//  public void loginPage() {
//
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		String targetResult=driver.findElement(By.tagName("h2")).getText();
//		Assert.assertNotEquals(targetResult, "Welcome Back, Admin!");
//
//  }
//  
//}
