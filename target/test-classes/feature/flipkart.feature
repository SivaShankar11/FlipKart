#Author: siva	 

@tagflipkartfeature
Feature:flipkart site automation

  @tag1additemaddtocart
  Scenario: Add an item to the cart
    Given Launch browser
    When user enters username password 
    And clicks on the login button 
    When user enters the data on the search bar
    And clicks on the search button
    And clicks on the item
    And clicks on the add to cart button 
    Then user validates the order by the place order text 
    
#
    #@tag1additemaddtocartt
    #Scenario Outline: Add an item to the cartt
     #When user enters username password 
    #And clicks on the login button 
    #
    #Examples:
    #|9080304979| Flipkrt11!|
  
