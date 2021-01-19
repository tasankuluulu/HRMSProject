Feature: Login Functionality

@smoke
  Scenario: Login with valid credentials
    Given go to HRMS login page
    When login with valid credentials
    Then verify the dashboard logo is displayed
    And quit the browser
    
  Scenario: Login with invalid credentials
    Given go to HRMS login page
    When login with invalid credentials
    Then verify the error message
    And quit the browser
 
 @smoke  
  Scenario: Login without username
    Given go to HRMS login page
    When login without username
    Then verify empty username message
    And quit the browser
    
  Scenario: Login with empty password
    Given go to HRMS login page
    When login with empty password
    Then verify empty password message
    And quit the browser