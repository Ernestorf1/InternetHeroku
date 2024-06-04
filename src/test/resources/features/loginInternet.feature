Feature: login in Internet Heroku Page

    @Test3
    Scenario Outline: login with valid and invalid credentials
        Given user is on Internet heroku Page
        When user clicks on auth option
        When user input valid credentials <username> <password>
        Then user should see welcome message

        Examples:
            | username | password    |
            | student  | Password123 |
            | ADMIN    | admin       |
            | admin    | ADMIN       |
            | student  | Password123 |

