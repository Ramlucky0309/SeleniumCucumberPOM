package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	public static WebDriver driver;
	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Automation Tesing\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void writeText(By Xpath, String Testdata) {
		driver.findElement(Xpath).sendKeys(Testdata);
	}
	public static void onClick(By Xpath) {
		driver.findElement(Xpath).click();
	}
	public String fetchText(By Xpath) {
	return driver.findElement(Xpath).getText();
	}
	public boolean isElementPresent(By xpath) {
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
			return true;
		}
		catch(Exception e) {
			return false;
		}
		
	}
	public WebElement waitForElementPresent(By xpath) {
		
			WebDriverWait wait=new WebDriverWait(driver, 20);
			return wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
	}
	
	
	public WebElement waitForElementPresent1(By xpath) {
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		return wait.until(ExpectedConditions.presenceOfElementLocated(xpath));
}

	
}