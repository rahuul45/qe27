package com.cognizant.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	@Test
	public void ScreenshotDemo() throws IOException {
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://training-support.net/webelements/drag-drop");
	
	TakesScreenshot shot= ( TakesScreenshot) driver;
	File screenshot=shot.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshot, new File("C:\\Users\\2440663\\Downloads\\screenshot.png"));
	System.out.println("screenshot taken");
	

}
}
