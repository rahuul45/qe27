//package com.cognizant.testng;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//
//public class BaseClass1 {
//	  WebDriver  driver;
//	   
//	   
//		@BeforeSuite	
//	  public void Login() {
//			driver = new ChromeDriver();
//
//		}
//		
//		@AfterTest
//		public void Close() {
//			driver.quit();
//		}
//		
//	  
//	  
//	  
//	}