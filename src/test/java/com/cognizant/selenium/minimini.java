package com.cognizant.selenium;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class minimini {
	@Test
	
	public void DeletingSkillsSet() throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    // Login
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");

	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button")).click();
	    
	   //Admin
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']")));
	    driver.findElement(By.xpath("//span[text()='Admin']")).click();
	  
	    //Job
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Job ']"))).click();
	    driver.findElement(By.xpath("//a[text()='Job Categories']")).click();
	    
	  //Add Test Engineer
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))).sendKeys("Test Engineer");
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  
	  //Scroll
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1000)");

	  //Delete Test Engineer
	  WebElement row =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Test Engineer']/ancestor::div[contains(@class,'oxd-table-row')]")));
      row.findElement(By.xpath(".//button")).click();
      driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
      
      //Organization
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Organization ']"))).click();
	  driver.findElement(By.xpath("//a[text()='Locations']")).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[1]")).sendKeys("Rahul");
	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[2]")).sendKeys("Hyderabad");
	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[3]")).sendKeys("Telangana");
	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[4]")).sendKeys("545456");


WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
    By.xpath("//div[text() = '-- Select --']")));
dropdown.click();

driver.findElement(By.xpath("//span[text()='Angola']")).click();


	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[5]")).sendKeys("9134987423");
	  driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[6]")).sendKeys("345345245");
	
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  
	  //Delete Location
	 
	// Step 1: Locate the row with country 'Angola'
	WebElement angolaRow = wait.until(ExpectedConditions.presenceOfElementLocated(
	    By.xpath("//div[text()='Angola']/ancestor::div[contains(@class,'oxd-table-row')]")));

	// Step 2: Find the delete button within that row
	WebElement deleteButton = angolaRow.findElement(
	    By.xpath(".//button[contains(@class,'oxd-icon-button') and .//i[contains(@class,'bi-trash')]]"));

	// Step 3: Click the delete button
	deleteButton.click();

	// Step 4 (Optional): Confirm deletion if a modal appears
	WebElement confirmDelete = wait.until(ExpectedConditions.elementToBeClickable(
	    By.xpath("//button[text()=' Yes, Delete ']")));
	confirmDelete.click();
	
	
	//Qualifications
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Qualifications ']"))).click();
	    driver.findElement(By.xpath("//a[text()='Skills']")).click();
	    //Add Skill
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"))).sendKeys("Test Demo");
		  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		//Scroll
		
		  js.executeScript("window.scrollBy(0,1000)");

		  //Delete Test Engineer
		  WebElement skillRow =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Test Demo']/ancestor::div[contains(@class,'oxd-table-row')]")));
	      skillRow.findElement(By.xpath(".//button")).click();
	      driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
	      
	      //Logout
	      driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		     driver.findElement(By.xpath("//a[text() = 'Logout']")).click();

	 
	    
	    Thread.sleep(8000);
	   driver.quit();
	    
	}

}