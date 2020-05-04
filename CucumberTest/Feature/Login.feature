@First 
Feature: Login Feature
@Regression
Scenario: champs login
Given the user should launch chrome browser
And load the url
When the user should login with username and password
|dachu.shyani@gmail.com|dachu@1988|
And the user should landed on Homepage
Then the user sshould click on boy imagae.
And the user should return to home page and click on girl image.

Scenario: champs shop
Given the user should select Tianna Dress
When the user should get the size
Then the user should get the quantity
And the user should select product and Add to Cart
And checkout


Scenario: champs Shipping
Given the user should enter the Address page
When the user should get the size and contiune to shipping
Then the user should click on the statndard button and contiue to payment
And the user should select quick pay and same as shipping Address and complete order

Scenario: Card Details
Given The user should enter the card number
|4233 467 7654 4323|
When The user should enter Expiry date
|05|
|2020|
Then the user should enter the CVV
|222|
And click on pay





