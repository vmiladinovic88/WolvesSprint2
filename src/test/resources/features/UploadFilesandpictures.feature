Feature: Upload Files and Picture
  Agile Story: As a user, I should be able to upload files and pictures as messages


  Scenario: US01_AC1_TC1_User uploads a valid file or picture
    Given the user is on the login page
    And user is on the file upload page
    When the user selects a valid file with the format .pdf, .txt, .jpeg, .png, or .docx
    And clicks on the upload button
    Then the file should be successfully uploaded
    And a success message should be displayed

  Scenario: US01_AC1_TC2_User inserts uploaded files and images into the text
    When user is on the file upload page
    Then the user should be able to select the file/image from the available uploaded items
    And insert it into the text at the desired position

  Scenario: US01_AC1_TC3_User removes a file or image before sending
    Given the user has uploaded files and images
    When the user is composing a text message and has inserted files/images into the text
    Then the user should be able to remove the file/image from the text
    And the file/image should no longer be displayed in the text


