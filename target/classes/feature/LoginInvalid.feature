Feature: To validate invalid login functionality
Scenario Outline: To validate user is able to login with invalid credentials
Given Chrome Browser is open 
And user is on OrangeHRM login page
When user enters invalid credentials in "<username>" and "<password>" text fields
Then user is unable to login 
And the page displays error message invalid credentials 
Examples:
|username|password|
|Harsha|harsha123|
|admin|admin|