@B29G15-266 @login
Feature: Default

	
	@B29G15-264
	Scenario: Auto-Verify users can view the options on Activity Stream page
		Given user land on the "stream" page
		And user view the following options on Activity stream page
		      | MESSAGE |
		      | TASK    |
		      | EVENT   |
		      | POLL    |
		      | MORE    |	

	
	@B29G15-265
	Scenario: Auto-Verify users can view the options under More tab
		Given user land on the "stream" page
		And user clicks the MORE tab
		    And user views the following options under more tab
		      | File         |
		      | Appreciation |
		      | Announcement |
		      | Workflow     |