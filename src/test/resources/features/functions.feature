 @Benjy
Feature: Company Structure Functions under Employee Menu

  User Story: As a user, I should be able to use functions on company Structure under Employee menu

  Background: for all scenarios
    Given user is on the company login page

  Scenario: Verify company structure is displayed for HR user types
    When user enters username "hr1@cybertekschool.com" and password "UserUser"
    And user clicks on the employees link
    And the user is on the company structure page
    Then user sees the company structure is displayed correctly


  Scenario: Verify company structure is displayed for Helpdesk user
    When user enters username "helpdesk45@cybertekschool.com" and password "UserUser"
    And user clicks on the employees link
    And the user is on the company structure page
    Then user sees the company structure is displayed correctly



  Scenario: Verify company structure is displayed for Marketing user
    When user enters username "marketing10@cybertekschool.com" and password "UserUser"
    And user clicks on the employees link
    And the user is on the company structure page
    Then user sees the company structure is displayed correctly


  Scenario: Verify HR user can add Department to the company structure
    When user enters username "hr1@cybertekschool.com" and password "UserUser"
    And user clicks on the employees link
    And the user is on the company structure page
    And user clicks on add department
    And user enters new department name
    And user clicks on the add button
    And user verifies if the new department is successfully added







