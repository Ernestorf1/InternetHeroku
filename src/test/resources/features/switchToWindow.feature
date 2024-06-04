Feature: Switch to window on Internet Heroku Web Page


Scenario: Switch to a new window
Given user is on main Page
When user clicks on Multiple Windows
And user switch to a new window
Then verify user is on the new window 
And go back to main page