//package com.cognizant.selenium;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Activity3 {
//	@Test
//	public void activity3demo() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://v1.training-support.net/selenium/target-practice");
//		System.out.println(driver.getTitle());
//		
//		WebElement x=driver.findElement(By.xpath("//h3"));
//		System.out.println(x.getText());
//		
//		WebElement y=driver.findElement(By.xpath("//h5"));
//		System.out.println(y.getCssValue("color"));
//		
//		WebElement z=driver.findElement(By.xpath("//button[text()='Violet']"));
//		System.out.println(z.getAttribute("class"));
//		
//		WebElement m=driver.findElement(By.xpath("//button[text()='Grey']"));
//		System.out.println(m.getText());
//	}
//
//}
