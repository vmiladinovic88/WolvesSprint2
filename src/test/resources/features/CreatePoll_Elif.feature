@B29G15-263 @login
Feature: Default

	
	@B29G15-255
	Scenario: US10/AC1/TC1: The delivery should be to 'All employees' by default.
		Given the user is on the stream page
		    When user click on the Poll tab
		    Then user should see "All employees" by default for delivery option	

	
	@B29G15-256
	Scenario Outline: US10/AC2/TC2: Create a poll with questions and multiple answers
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user enter the poll title as "<PollTitle>"
		    And user add the "<Question>"
		    And user add the Answers
		
		      | <Answer1> |
		      | <Answer2> |
		      | <Answer3> |
		
		    And user submit the poll by clicking send button
		    Then user should see a "<PollTitle>" on the page
		
		    Examples:
		      | PollTitle  | Question                                  | Answer1 | Answer2 | Answer3 |
		      | Technology | Which programming language do you prefer? | Java    | Python  | Kotlin  |
		      | Food       | What is your favorite cuisine?            | Turkish | Mexican | Italian |	

	
	@B29G15-257
	Scenario: US10/AC3/TC3: User should be able to select “Allow multiple choice” checkbox.
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user click Allow multiple choice checkbox
		    Then user should see Allow multiple choice is selected	

	
	@B29G15-258
	Scenario: US10/AC4/TC4:Error message: "The message title is not specified"
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user leave poll title empty
		    And user submit the poll by clicking send button
		    Then user should see "The message title is not specified" error message	

	
	@B29G15-260
	Scenario: US10/AC4/TC5: Error message: "Please specify at least one person."
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user enter the poll title "Poll Title"
		    And user display All employees option
		    And user submit the poll by clicking send button
		    Then user should see "Please specify at least one person." error message	

	
	@B29G15-261
	Scenario: US10/AC4/TC6: Error message: "The question text is not specified."
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user enter the poll title "Poll Title"
		    And user leave question field empty
		    And user enter answer "answer"
		    And user submit the poll by clicking send button
		    Then user should see "The question text is not specified." error message	

	
	@B29G15-262
	Scenario Outline: US10/AC4/TC7: Error message: "The question "........." has no answers."
		Given the user is on the stream page
		    When user click on the Poll tab
		    And user enter the poll title "Poll Title"
		    And user enter question "<Question>"
		    And user leave answer fields empty
		    And user submit the poll by clicking send button
		    Then user should see "The question \"<Question>\" has no answers." error message
		
		    Examples:
		      | Question          |
		      | How was your day? |