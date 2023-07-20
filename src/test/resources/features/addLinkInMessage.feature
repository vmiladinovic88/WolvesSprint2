@login @link
Feature: As a user, I should be able to add link in message


    Scenario: Verify user is able to attach a link to the specified text
      When User clicks on Send message field
      And  User sees attach link button is displayed
      Then User clicks on attach button
      And  User sees "link" field
      And  User types Google URL
      And  User clicks "Save" button


    Scenario: By clicking on the link, user should be able to navigate to the correct URL
      When User clicks on Send message field
      And  User sees attach link button is displayed
      Then User clicks on attach button
      And  User sees "link" field
      And  User types Google URL
      And  User clicks "Save" button
      And  User clicks "Send" button that is displayed
      And  User clicks on the "Google" URL
      Then Google page opens up in the new tab




