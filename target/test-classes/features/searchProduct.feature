Feature: Testing Greekart Page with search and place order
  
  Scenario Outline: Search Experience for product search in both home and Offers page
  Given User is on Greenkart Landing page
  When User searched with the product name <Name> in textbox and extracted the actual name of the product from search.
  Then User clicked on the top deals link and search the product name <Name> and extracted the name of the product from table.
  And Validate the product name matches with the offers page and landing page.

Examples:
| Name  |
| Tom 	|
| Beet  |