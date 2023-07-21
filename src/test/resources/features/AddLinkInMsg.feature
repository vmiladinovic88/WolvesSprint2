@login @B29G15-269
Feature: Default

	
	@B29G15-267
	Scenario: As a user, I should be able to add link in message
		      When User clicks on Send message field
		      And  User sees attach link button is displayed
		      Then User clicks on attach button
		      And  User sees "link" field
		      And  User types Google URL
		      And  User clicks "Save" button	

	
	@B29G15-268
	Scenario: As a user, I should be able to add link in message
		      When User clicks on Send message field
		      And  User sees attach link button is displayed
		      Then User clicks on attach button
		      And  User sees "link" field
		      And  User types Google URL
		      And  User clicks "Save" button
		      And  User clicks "Send" button that is displayed
		      And  User clicks on the "Google" URL
		      Then Google page opens up in the new tab