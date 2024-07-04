Feature: Login to LeafTaps Application

Scenario: Login with Positive Data

#Given Launch the Browser and load the URL 
When Enter the Username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
And Click on LoginButton
Then Verify the page  




Scenario: Login with Negatve Data

#Given Launch the Browser and load the URL 
When Enter the Username as 'DemoSales'
And Enter the Password as 'crmsfa'
And Click on LoginButton
But Verify the Hpage