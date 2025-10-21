//package com.cognizant.selenium;
//
//import static org.testng.Assert.*;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class AssertionsExample {
//WebDriver driver;
// @BeforeClass
// public void beforeClassMethod() {
//	driver=new ChromeDriver();
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	System.out.println("Before");
// }
//
//	@Test
//	public void SignUp() {
//		System.out.println("SignUp");
//		assertTrue(true);
//	}
//	
//	@Test
//	public void forgot() {
//		SoftAssert soft= new SoftAssert();
//		soft.assertTrue(true);
//		soft.assertTrue(false);
//		soft.assertAll();
//		
//		
//		
//	}
//	
//	@Test(dependsOnMethods= {"SignUp","forgot"})
//	public void LoginPage() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
//	    driver.findElement(By.name("password")).sendKeys("admin123");
//	    driver.findElement(By.xpath("//button")).click();
//	    System.out.println("Login Page");
//	}
//	
//	@AfterTest(alwaysRun=true)
//	public void afterClassMethod() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.quit();
//		
//	}
//
//}
