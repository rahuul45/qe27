//package com.cognizant.selenium;
//
//import java.time.Duration;
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//
//public class Activity1 {
//	@Test
//	public void Activity11() {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://v1.training-support.net/selenium/ajax");
//		
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		
//		WebElement changeButton = driver.findElement(By.xpath("//button[text()='Change Content']"));
//        changeButton.click();
//
//         wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late"));
//         WebElement message=driver.findElement(By.tagName("h3"));
//         System.out.println(message.getText());
//                
//	}
//
//}
//
// 
//
