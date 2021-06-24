Feature: Check user able to Login in Amazon
   check user able to search the item
   As a user of google
   In order to select item and add to cart
   verify

  Scenario: User able login and search Item and add to cart
    Given User is Logged in
    When enter "shirt for man" in search textbox
    Then add item to checkout
    Then add item to cart
    Then proceed to checkout
		When enter invalid email "sankar@test.com"
		Then verify the error message "We cannot find an account with that email address"