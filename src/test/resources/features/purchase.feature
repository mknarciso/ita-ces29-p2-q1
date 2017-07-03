## (Comments)


Feature: Different steps of a purchase

Scenario: Save to wishlist
Given I am a costumer
  And I have found the book Navegando pelo Mundo
 When I click on save to wishlist
 Then It will be on my wishlist

Scenario: Make a purchase
Given I am a costumer
  And I have found the book Navegando pelo Mundo
 When I click on buy
 Then I will make the purchase

Scenario: Rate a purchase
Given I have made a purchase
 When I rate it
 Then My rate will be saved
  
  Scenario: Review a Book
Given I have made a purchase
 When I review it
 Then My review will be saved