Feature: Login and Account functionality for opencart E-commerce website

As a user of the OpenCart website
I want to be able to log in with my account
so that i can access my account-related features.

Background:
	Given I am on the OpenCart login page

Scenario: Successful login with valid credentials
	Given I have entered a valid "<username>" and "<password>"
	When I click on the login button
	Then I should be logged in successfully
	
Examples:
| username						 |password|
|qatestertest@gmail.com|Test@123|

Scenario: Changing the lastname in the account section
	Given I am on the Home Page
	When  I click on the Edit your account information
	And		I have entered the lastname in the textbox
	Then 	I click on the continue button.