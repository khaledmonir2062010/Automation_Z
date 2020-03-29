Feature: Create Order
  I want to check that the user can create order from the webportal normally

 Scenario Outline: Create_Order
    Given The user in the Home page
    When I click on start ordering button
    And Choose Deleviery Area
    And add an item with quantity 3 to the cart
    And User Enter "<ContactName>","<Num>"
    And Enter Address Info "<Blockno>","<streetno>","<Houseno>"
    And Click Place order button
    Then Order Placed Succesfully
    
Examples:

| ContactName |    Num    | Blockno | streetno | Houseno |
| Helloworld  | 010101010 |    2    |     2    |    2    |






