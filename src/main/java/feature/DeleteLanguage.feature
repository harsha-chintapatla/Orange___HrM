Feature: Delete selected language
Scenario: To validate the functionality that user is able to delete selected language
Given user is on Qualifications module of my info module
When user checks checkbox of any added language
And user clicks on delete
Then user is able to succesfully delete the corresponding language added