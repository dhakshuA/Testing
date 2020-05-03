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

Scenario: 
Given The user should enter the card number
|4211 3456 7654 5678 |

When The user should enter Expiry date
|05|
|2022|
And the user should enter the CVV
|222|
Then click on pay
