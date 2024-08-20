#Author: your.email@your.domain.com
Feature: free CRM to create a new contacts

  Scenario Outline: free CRM to create a new contact scenario
    Given uer logged in page
    When tile of page is free CRM
   
    Examples: 
      | Username               | Password   | firstName | lastName | position |
      | babitatha011@gmail.com | Kanika@123 | Tom       | Peter    | Manager  |
