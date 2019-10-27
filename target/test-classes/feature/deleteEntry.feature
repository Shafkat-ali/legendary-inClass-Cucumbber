Feature: Delete Entry

@SmokeTest
Scenario Outline: Delete user entry
Given Navigate to "<URL>"
When Login using valid Credentials provided
And Validate you're logged in by verifying "<Welcome Admin>"
Then Click on ADMIN to navigate to the page
And Click checkbox for "<user>"
And Click DELETE
Then Click OK on the popup window
And Verify there is no "<user>" under username column
Then Logout

Examples:
    |Welcome Admin|user|
    |Welcome Admin|thomas.fleming|
