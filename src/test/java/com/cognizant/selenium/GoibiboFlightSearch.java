//package com.cognizant.selenium;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.*;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//
//public class GoibiboFlightSearch {
//
//    @Test
//    public void GoibboFlight() {
//        WebDriver driver = new EdgeDriver();
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        driver.get("https://www.goibibo.com/");
//
//      
//       WebElement closeLogin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='logSprite icClose']")));
//       closeLogin.click();
//        
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']"))).click();
//
//     
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='From']"))).click();
//
//    
//        WebElement fromBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
//        fromBox.sendKeys("Hyderabad");
//
//        List<WebElement> fromOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='autoSuggest-list']/li")));
//        System.out.println("From options:");
//        for (WebElement opt : fromOptions) {
//            System.out.println(opt.getText());
//        }
//        fromOptions.get(0).click();
//
//     
//        WebElement toBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
//        toBox.sendKeys("Bengaluru");
//
//        
//        List<WebElement> toOptions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id='autoSuggest-list']/li")));
//        System.out.println("To options:");
//        for (WebElement opt : toOptions) {
//            System.out.println(opt.getText());
//        }
//        toOptions.get(0).click();
//
//        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='SEARCH FLIGHTS']")));
//        searchBtn.click();
//
//        System.out.println("Flight search initiated successfully.");
//
//        driver.quit();
//    }
//}
