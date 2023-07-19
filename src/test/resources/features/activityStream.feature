@login @activity
Feature: Visibility of options on the page

  User Story:
  As a user, I should be able to see all the options on the Activity stream page.

  Background: For all scenarios user is on the login page of CRM application
    Given user land on the "stream" page



  Scenario:  Options verification
    And user view the following options on Activity stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |


  Scenario:  Dropdown  verification
    And user clicks the MORE tab
    And user views the following options under more tab
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |