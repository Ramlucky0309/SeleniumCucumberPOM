package com.cucumber.stepDefnition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.core.TestBase;
import com.cucumber.listener.Reporter;
import com.manager.ObjectManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends ObjectManager {
	
	@Before()
	public void intiateBrowser4() {
		testBase= new TestBase();
		testBase.openBrowser();
		
	}
	
	
	@After()
	public void closeBrowser12() throws IOException {
		String path = System.getProperty("user.dir") +"\\"+  System.currentTimeMillis();
		System.out.println("Path"+path);
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(path+ ".png");
		String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        Reporter.addScreenCaptureFromPath(errflpath);
        
		driver.quit();
		//TakeScreem
		//testBase.quitBrowser();
		
		
	}
	
	

}
