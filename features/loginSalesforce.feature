
Feature: Login to Salesforce Application

Scenario: Login and Verify Accouunt Name 

Given Launch the Browser and the URL 
When enter the username as 'dilip@testleaf.com'
And enter the password as 'testleaf@2024'
And click the login button
And Click on toggle menu button from the left corner
And Click view All 
And click Sales from App Launcher
And Click on Accounts tab 
And Click on New button
And Enter 'Diwan' as account name
And Select Ownership as Public 
And Click save 
Then verify Account name



















 