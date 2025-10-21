package com.cognizant.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {
	@Test
	public void iframeExample() throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://training-support.net/webelements/iframes");;
//	 WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Frame1']"));
//     driver.switchTo().frame(iframe);
	driver.switchTo().frame(1);

     WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
     button.click();

  
}
}