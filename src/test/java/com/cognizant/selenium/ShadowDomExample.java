package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomExample {
	@Test
	public void multipleSelect() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
//		WebElement shopElement=driver.findElement(By.cssSelector("shop-app"));
//		System.out.println(shopElement.getTagName());
//		SearchContext context=shopElement.getShadowRoot();
//	
//		
//		WebElement ironElement=context.findElement(By.cssSelector("iron-pages>shop-home"));
//		System.out.println(ironElement.getTagName());
//		SearchContext nestedcontext=ironElement.getShadowRoot();
//		
//		WebElement divElement=nestedcontext.findElement(By.cssSelector("div:nth-of-type(1)>shop-button"));
//		
//		System.out.println(divElement.getTagName());
//		divElement.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement targetElement = (WebElement) js.executeScript("return document.querySelector('shop-app')"
				+ ".shadowRoot.querySelector('iron-pages').querySelector('shop-home')"
				+ ".shadowRoot.querySelector('div:nth-of-type(1) > shop-button > a')");
		targetElement.click();

}
}
