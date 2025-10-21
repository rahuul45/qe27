package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectExample {
	@Test
	public void multipleSelect() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://training-support.net/webelements/selects");
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
		WebElement dropdown=driver.findElement(By.xpath("//option[text()='Rust']/parent::select"));
		Select ele=new Select(dropdown);

		 if (ele.isMultiple()) {
	           
	            ele.selectByVisibleText("JavaScript");
	            ele.selectByIndex(3);
	            ele.selectByIndex(4);
	            ele.selectByIndex(5);
	            ele.selectByValue("nodejs");
	            ele.deselectByIndex(0);
	            ele.deselectByIndex(4);
		
	}
		 
}
}
