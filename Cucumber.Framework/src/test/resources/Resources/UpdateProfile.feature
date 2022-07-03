
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  Scenario: TC1_verify user is able to update the naukri profile by uploading resume
    Given user is on login page
    And user clicks on login button beside register button
    Then user enter username
    And user enters password
    When user clicks on loggin button at login page
    Then Verify user is on home page
    When user clicks on update profile button at home page
    Then verify user is on update profile page
    Then user clicks on upload resume button
    Then verify user is able to upload the resume 
    
  Scenario: TC2_verify user is able to update the naukri profile by updating resume headlines
    Given user is on login page
    And user clicks on login button beside register button
    Then user enter username
    And user enters password
    When user clicks on loggin button at login page
    Then Verify user is on home page
    When user clicks on update profile button at home page
    Then verify user is on update profile page
    Then user clicks on edit button on resume headlines
    Then user enter resume headlines in the headline section
    Then User clicks pn save button
    Then verify profile got updated after submitting the resume headline details
    
    
  Scenario: TC3_verify user is able to update the naukri profile by updating keySkills
    Given user is on login page
    And user clicks on login button beside register button
    Then user enter username
    And user enters password
    When user clicks on loggin button at login page
    Then Verify user is on home page
    When user clicks on update profile button at home page
    Then verify user is on update profile page
    Then user clicks on update resume button  
      


      
  