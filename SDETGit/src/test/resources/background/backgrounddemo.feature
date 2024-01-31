Feature: This is background demo

Background: User is logged in to saucedemo app
Given User is accessing saucedemo login page
When User enters valid username and password
Then User should be able to navigate to home page

Scenario: Test Menu Items
And Click on breadcrumb icon
Then User should be able to see menu items

Scenario: Verify add to cart functionality
And Click on Add to button
Then Item should be added to the cart

