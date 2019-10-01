@login
Feature: OrangeHrm Application Test

#without Examples Keyword
Scenario: Validate OrangeHrm Login Page Test 	

Given user open browser
When user is on login page 
Then user enter "Admin" and "admin123"	
Then user clicks login button