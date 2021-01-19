@findEmployee
Feature: Find Employee

  Background: 
    When login with valid credentials
    Then navigate to add employee list page

  Scenario: Search employee by Id
    When enter employee ID "8438"
    Then click on Search button

    