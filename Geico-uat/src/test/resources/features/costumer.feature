@Costumer
Feature: Fill costumer info

Scenario: User fills the information boxes

Given The user on the main page
When The user verifies the title and the url
And The user enters zip code
And The user clicks on the start quote button
And The user enters first name
And The user enters last name
And The user enters street adress
And The user enters  apt number
And The user fills date of birth boxes
And The user clicks next

@Vehicle
Scenario: User fills the vehicle information

Given The user is on the Add vehicle page
When the user selects a year
When the user selects a make 
When the user selects a model
When the user selects a body style
When the user selects a ofl
When the user selects primary use
When the user selects how
When the user selects milage
When the user clicks no