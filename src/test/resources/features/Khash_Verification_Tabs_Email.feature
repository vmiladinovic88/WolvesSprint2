@B29G15-253 @login
Feature: Default

	
	@B29G15-250
	Scenario Outline: Verification of tab options on My Profile page
		Given User is on CRM homepage as "<userType>"
		    And User click on Profile icon
		    And User click on My profile option
		    Then User sees "<expectedGeneralTab>" on My Profile page first
		    Then User sees "<expectedDriveTab>" on My Profile page second
		    Then User sees "<expectedTasksTab>" on My Profile page third
		    Then User sees "<expectedCalendarTab>" on My Profile page forth
		    Then User sees "<expectedConversationsTab>" on My Profile page fifth
		
		
		    Examples: Values we going to be using in this scenario outlines
		      | userType | expectedGeneralTab | expectedDriveTab | expectedTasksTab | expectedCalendarTab | expectedConversationsTab |
		      | HR       | General            | Drive            | Tasks            | Calendar            | Conversations            |	

	
	@B29G15-254
	Scenario: Verification of Email address
		Given User is on CRM homepage as "<userType>"
		    And User click on Profile icon
		    And User click on My profile option
		    And User click on General tab button
		    Then User sees email address under General tab