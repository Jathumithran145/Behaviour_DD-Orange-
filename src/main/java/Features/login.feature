Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#user clicks and create User
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

	Given user is already on Login Page
	When user enters username and password
	Then user clicks on login button
	Then user clicks and create User
	Then user clicks User
	Then user clicks and create UserName and details
	Then user add details
	Then Close the browser
 #Then Close the browser

#
Examples:
	| username               | password |
	| jazzjack145@gmail.com  | test@123 |
#	|  tom     | test456  |
