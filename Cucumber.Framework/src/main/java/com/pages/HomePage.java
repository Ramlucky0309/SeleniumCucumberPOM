package com.pages;



	import org.openqa.selenium.By;

	import com.core.TestBase;

	public class HomePage extends TestBase {
		
			private By searchDomainInputPath = By.xpath("//input[@id='qsb-keyskill-sugg']");
			private By searchCompanyInputPath = By.xpath("//input[@id='qsb-location-sugg']");
			private By clickOnSearchXpath = By.xpath("//button[@type='submit']");
			private By clickOnWFHXpath	= By.xpath("//i[@class='fleft naukicon naukicon-checkbox']");
			
			public void enterhDomainName (String searchDomainName) throws InterruptedException {
			Thread.sleep(2000);
			writeText(searchDomainInputPath, searchDomainName);
			}
			
			public void enterComapnyName (String serachComapnyName) {
				writeText (searchCompanyInputPath, serachComapnyName);
			}
			
			public void clickOnSearch () throws InterruptedException {
				onClick(clickOnSearchXpath);
				Thread.sleep(3000);
				
			}
			public void clickOnWFH() {
				onClick(clickOnWFHXpath);
				
			}
			
		
			}	

