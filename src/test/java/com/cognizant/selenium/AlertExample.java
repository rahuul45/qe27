//package com.cognizant.selenium;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class AlertExample {
//	@Test
//	public void multipleSelect() throws InterruptedException {
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://training-support.net/webelements/alerts");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("prompt")).click();
//		Alert alert=driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.sendKeys("Hi");
//		alert.dismiss();
//}
//}
