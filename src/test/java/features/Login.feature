Feature: Application Login

 
Background:
Given validate the browser
When Browser is triggered
Then check if browser is started


@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User loginto application with "jin" and "1234"
Then Home page is populated
And Cards are displayed are "true"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User loginto application with "john" and "4321"
Then Home page is populated
And Cards are displayed are "false"

@PortalTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User signup with following details
| jenny | abcd | john@abcd.com | Australia | 3242353 |
Then Home page is populated
And Cards are displayed are "false"

@PortalTest
Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login to application with <Username> and <password>
Then Home page is populated
And Cards are displayed are "true"

Examples:
|Username |password|
|user1 |pass1 |
|user2 |pass2 |
|user3 |pass3 |
|user4 |pass4 |


