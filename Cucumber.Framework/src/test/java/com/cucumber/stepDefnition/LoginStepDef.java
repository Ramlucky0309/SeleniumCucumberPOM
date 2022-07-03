package com.cucumber.stepDefnition;

import com.core.TestBase;
import com.manager.ObjectManager;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends ObjectManager{
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		
		loginPage.verifyLoginPage();
	   
	}



	@Given("^user clicks on login button beside register button$")
	public void user_clicks_on_login_button_beside_register_button() throws Throwable {
		System.out.println("testing");
	    
	}

	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {
		loginPage.enterUserName("test");
	    
	}

	@Then("^user enters password$")
	public void user_enters_password() throws Throwable {
		loginPage.enterPassword("1234");
	    
	}

	@When("^user clicks on loggin button at login page$")
	public void user_clicks_on_loggin_button_at_login_page() throws Throwable {
		loginPage.onclickLoginButton();
	    
	}

	@Then("^Verify user is on home page$")
	public void verify_user_is_on_home_page() throws Throwable {
	    
	    
	}
	@Then("^user enter \"([^\"]*)\" username$")
	public void user_enter_username(String username) throws Throwable {
		loginPage.enterUserName(username);
	}

	@Then("^user enters \"([^\"]*)\" password$")
	public void user_enters_password(String password) throws Throwable {
		loginPage.enterPassword(password);
	}
	@Then("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String username, String password) throws Throwable {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	}
	@Given("^user enters username \"([^\"]*)\"$")
	public void user_enters_username(String username) throws Throwable {
		loginPage.enterUserName(username);
		
	}

	@Then("^users enters passowrd \"([^\"]*)\" in step$")
	public void users_enters_passowrd_in_step(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@Then("^verify the login functionality \"([^\"]*)\"$")
	public void verify_the_login_functionality(String arg1) throws Throwable {
	   
	}




}
