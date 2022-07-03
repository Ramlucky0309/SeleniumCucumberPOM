package com.pages;


import org.openqa.selenium.By;
import com.core.TestBase;

public class ProfilePage extends TestBase{
	
	private static By onClickMyNaukriXpath = By.xpath("//*[text()='My Naukri']");
	private static By onClickUpdteProfileXpath = By.xpath("//div[@class='btn btn-block btn-large white-text']");
	private static By onClickUpdateResumeXpath = By.xpath("//input[@id='attachCV']");
	
	public void clickMyNaukri () {
		onClick(onClickMyNaukriXpath);
	}
	
	public void clickOnUpdateProfile() {
		onClick(onClickUpdteProfileXpath);
	}
	 public void clickOnUpdateResume() {
		 onClick(onClickUpdateResumeXpath);
		 
	 }
	
	
	
}
		
	
	
	


