@tag @Regression
Feature: Login Feature functionality of Naukri application
	Background: User loggedIn
		Given user is on login page
    And user clicks on login button beside register button
  

  @tag1 @Regression
  Scenario: Verify user is able to login to naukri application
    
    Then user enter username
    And user enters password
    When user clicks on loggin button at login page
    Then Verify user is on home page
    
    
    @tag3 @Regression
  Scenario: Verify user is able to login to naukri application
    
    Then user enter "ramlucky" username
    And user enters "123456" password
    When user clicks on loggin button at login page
    Then Verify user is on home page  
    
      @tag4 @Regression
  Scenario: Verify user is able to login to naukri application
    
   Then user enter username "123456" and password "12786876shdjn"
    When user clicks on loggin button at login page
    Then Verify user is on home page  

  @details @Regression 
  Scenario Outline: verify user is able to update profile by uploading resume
    Given user enters username "<username>"
    Then users enters passowrd "<password>" in step
    When user clicks on loggin button at login page
    Then verify the login functionality "<type>"

    Examples: 
      | username                    |     password      |         type         |
      | bhajanthriramu123@gmail.com |     Ramlucky%0309 |         valid        |
      | name2                       |     7             |  Invalid Username    |
      |                             |                   |         No details   |
