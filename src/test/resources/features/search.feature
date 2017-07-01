## (Comments)


Feature: Different ways to search for a book
Scenario: Hard Core Sailor
Given I am a hard core sailor
	And I have no experience with computers
 When I want to buy a book with title Navegando pelo Mundo
 Then I want to find the book Im looking for
	And dont want to feel stupid

Scenario: Novice Sailor
Given I am a novice sailor
 When I want to buy a book with title Navegando pelo Mundo
 Then I want to see similar recomendations
	And I want filters for my search

Scenario: Non-Sailing Buyer
Given I am a non-sailing buyer
	And I have experience with computers
 When I want to buy a book with title Navegando pelo Mundo
 Then I want to see similar recomendations
	And I want advanced delivey options