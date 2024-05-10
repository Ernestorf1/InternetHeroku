Feature: User Interacts with slider
   
Scenario: User set slider
Given User is on Internet Heroku App
Given user is on Horizontal Slider option
When  user drag the slider to value
Then user can see slider value position
