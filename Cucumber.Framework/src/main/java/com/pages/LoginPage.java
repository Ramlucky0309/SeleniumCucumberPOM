package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.core.TestBase;



public class LoginPage extends TestBase{

	private By userNameInputXpath = By.xpath("//input[@type='text']");
	private By passwordInputXpath = By.xpath("//input[@type='password']");
	private By loginButtonXpath = By.xpath("//button[contains(text(),'Login')][1]");
	private By invalidCredErrTextXpath = By.xpath("//form[@id='loginForm' and @class='loginForm']/div[2]/span");
	private By usernameErrTextXpath = By.xpath("//span[@id='usernameField_err']");
	private By passwordErrTextXpath = By.xpath("//span[@id='passwordField_err']");
	private By searchJobsTextXpath = By.xpath("//*[@name='quickSearchBarForm']/div");
	
	
	
	public void verifyLoginPage() {
		
		boolean flag = false;
		if(isElementPresent(loginButtonXpath)) {
			flag = true;
			
		}
		//Assert.assertTrue(isElementPresent(loginButtonXpath));
		
		Assert.assertTrue(flag);
		
	}
	public void enterUserName(String usernameText) throws InterruptedException {
		Thread.sleep(2000);
		writeText(userNameInputXpath,usernameText);
		
	}
	public void enterPassword(String Password) {
		
		writeText(passwordInputXpath,Password);
		
	}
	public void onclickLoginButton() throws InterruptedException {
		onClick(loginButtonXpath);
		Thread.sleep(3000);
		
	}
	
	
	public void loginFunctionality() {
		driver.findElement(userNameInputXpath).sendKeys("bhajanthriramu123@gmail.com");
		driver.findElement(passwordInputXpath).sendKeys("Ramlucky%0309");
		driver.findElement (loginButtonXpath).click();
		driver.manage().window().maximize();
		
	}
	
	public void verifyLoginFunctionalityWithDifferentTestData(String type) {
		if(type.equals("valid")) {
			waitForElementPresent(searchJobsTextXpath);
			String ActualSearchJobsText = fetchText(searchJobsTextXpath);
			Assert.assertEquals(ActualSearchJobsText, "Search Jobs", "Search Jobs text is not equal");			
		}
		else if(type.equals("Invalid Username")) {
			boolean flag = false; 
			
			//Assert.assertTrue(flag);
			if(isElementPresent(invalidCredErrTextXpath)) {
				flag = true;
			}
			
			Assert.assertTrue(flag);
			
			/*
			 * String ActualinvalidErrText = fetchText(invalidCredErrTextXpath);
			 * Assert.assertEquals(ActualinvalidErrText,
			 * "Invalid details. Please check the Email ID - Password combination.",
			 * "Actaul and expected error text displayed is invalid");
			 */
		}
		else if(type.equals("No details")) {
			boolean flag = false;
			boolean usernameFlag = false;
			boolean passwordFlag = false;
			if(isElementPresent(usernameErrTextXpath)&&isElementPresent(passwordErrTextXpath)) {
				flag = true;
			}
			Assert.assertTrue(flag);
			
			if(isElementPresent(usernameErrTextXpath)) {
				usernameFlag = true;
			}
			Assert.assertTrue(usernameFlag);
			
			if(isElementPresent(passwordErrTextXpath)) {
				passwordFlag = true;
			}
			Assert.assertTrue(passwordFlag);
			
			
		}
		
		
	}
	
}
	


