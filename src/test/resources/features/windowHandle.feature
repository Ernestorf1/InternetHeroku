Feature: Switch to window with specific title

@TestWindow
Scenario: verify window switching to a new window with specific title
Given user  navigates to Internet Heroku app page
When user navigates to Multiple Windows page
Then user clicks on the new link
Then should be two open Windows
And user can see a new window with specific title
When user close the second window
Then must be one window open
And user is on the principal window