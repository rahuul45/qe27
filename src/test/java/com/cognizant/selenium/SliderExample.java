package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class SliderExample {
	@Test
	public void sliderExample() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/sliders");
		WebElement sliderInput = driver.findElement(By.id("volume"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value =35", sliderInput);
		js.executeScript("arguments[0].dispatchEvent(new Event('change'))", sliderInput );
		
	
	}
}