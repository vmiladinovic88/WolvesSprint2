@login  @claritza

  Feature: As a user, I should be able to send messages by clicking on Message tab under Active Stream.

    Scenario:(US4 AC1 TC1) User should be able to send message by filling the mandatory fields
      Given user is already on logged in on the web page
      When  user is on the active stream page
      And   user clicks message button


    Scenario:(US4 AC1 TC2 Error message) "The message title is not specified"
      Given  user is on the active stream page
      When   user clicks message button
      And    user leave the message title blank
      Then   user should see "The message title is not specified"


    Scenario:(US4 AC1 TC3 Error message) "Please specify at least one person"
      Given  user is on the active stream page
      When   user clicks on send button
      And    user leave recipient field blank
      Then   user should see "Please specify at least one person"


    Scenario:(US4 AC2 TC4) The message delivery should be to "All employees" by default
      Given  user is already on logged in on the web page
      When   user is on the active stream page
      And    user click on message delivery button
      Then   user should see by the default "All employees"


    Scenario:(US4 AC3 TC5) User should be able to cancel message at any time before sending
      Given  user is already on logged in on the web page
      When   user is on the active stream page
      And    user types message
      And    user wants to cancel message
      Then   user should see cancel button before sending




