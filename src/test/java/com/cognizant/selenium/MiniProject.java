package com.cognizant.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class MiniProject {

    @Test
    public void DeletingSkillsSet() throws InterruptedException {
        loadProperties();
        setupBrowser();
        login();
        addAndDeleteJobCategory();
        addAndDeleteLocation();
        addAndDeleteSkill();
        logout();
        close();
    }
    WebDriver driver;
    WebDriverWait wait;
    Properties props = new Properties();

    public void loadProperties() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\2440663\\eclipse-workspace\\selenium\\src\\test\\java\\com\\cognizant\\selenium\\input.properties");
            props.load(fis);
        } catch (IOException e) {
            System.out.println("Failed to load input.properties: " + e.getMessage());
        }
    }

    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void login() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")))
            .sendKeys(props.getProperty("username"));
        driver.findElement(By.name("password")).sendKeys(props.getProperty("password"));
        driver.findElement(By.xpath("//button")).click();
    }

    public void addAndDeleteJobCategory() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Admin']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Job ']"))).click();
        driver.findElement(By.xpath("//a[text()='Job Categories']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")))
            .sendKeys(props.getProperty("jobCategory"));
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

        WebElement row = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Test Engineer']/ancestor::div[contains(@class,'oxd-table-row')]")));
        row.findElement(By.xpath(".//button")).click();
        driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();
    }

    public void addAndDeleteLocation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Organization ']"))).click();
        driver.findElement(By.xpath("//a[text()='Locations']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[1]")).sendKeys(props.getProperty("locationName"));
        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[2]")).sendKeys(props.getProperty("city"));
        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[3]")).sendKeys(props.getProperty("state"));
        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[4]")).sendKeys(props.getProperty("zip"));

        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text() = '-- Select --']")));
        dropdown.click();
        driver.findElement(By.xpath("//span[text()='" + props.getProperty("country") + "']")).click();

        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[5]")).sendKeys(props.getProperty("phone"));
        driver.findElement(By.xpath("(//input[@placeholder='Type here ...'])[6]")).sendKeys(props.getProperty("fax"));
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();

        WebElement angolaRow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Angola']/ancestor::div[contains(@class,'oxd-table-row')]")));
        WebElement deleteButton = angolaRow.findElement(By.xpath(".//button[contains(@class,'oxd-icon-button') and .//i[contains(@class,'bi-trash')]]"));
        deleteButton.click();

        WebElement confirmDelete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Yes, Delete ']")));
        confirmDelete.click();
    }

    public void addAndDeleteSkill() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Qualifications ']"))).click();
        driver.findElement(By.xpath("//a[text()='Skills']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Add ']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")))
            .sendKeys(props.getProperty("skillName"));
        driver.findElement(By.xpath("//button[text()=' Save ']")).click();

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

        WebElement skillRow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Test Demo']/ancestor::div[contains(@class,'oxd-table-row')]")));
        skillRow.findElement(By.xpath(".//button")).click();
        driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")).click();

        try {
           wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='Test Demo']")));
           System.out.println("Skill 'Test Demo' deleted successfully.");
           } catch (TimeoutException e) {
           System.out.println("Skill 'Test Demo' was not deleted.");
    }

    }

    public void logout() {
        driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
        driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
    }

    public void close() throws InterruptedException {
        Thread.sleep(8000);
        driver.quit();
    }

}
