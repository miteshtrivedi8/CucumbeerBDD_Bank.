@Login
Feature: User Login

  Scenario: Test the Login using DataTable
    Given user is on Login page
    When user enters Login data using DataTable
      | wick15 | tr111 |
    And click on login button
    Then user should be land on Bank home page
