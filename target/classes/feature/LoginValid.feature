Feature: To validate login functionality
Scenario: To validate user is able to login with valid credentials
Given Browser is open 
And user is on login page
When user enters valid credentials in username and password text fields
Then user is able to login successfully
And user is able to view homepage 