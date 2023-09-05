@Register
Feature: New User Registration

  Scenario: Validate new user is able to view after clicking on new Registration
    Given user is on parabank Homepage
    When user click on Registerpage link 
    Then user should be able to view the Registration page.
    
    Scenario: Test the Registration using DataTable
    Given user is on Registration page
    When user enters Registration data using DataTable
    |john1|wick2|15-US45|New York|New York|1r2e5g|+18875952|284|wick10|tr1111|tr1111|
    And click on Register button
    Then user should be land on home page
    
    
    