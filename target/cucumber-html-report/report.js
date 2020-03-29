$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Create Order",
  "description": "I want to check that the user can create order from the webportal normally",
  "id": "create-order",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Create_Order",
  "description": "",
  "id": "create-order;create-order",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "The user in the Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on start ordering button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Choose Delviery Area",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "add an item with quantity 3 to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter \"\u003cContactName\u003e\",\"\u003cNum\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter Address Info \"\u003cBlockno\u003e\",\"\u003cstreetno\u003e\",\"\u003cHouseno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Place order button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Order Placed Succesfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "create-order;create-order;",
  "rows": [
    {
      "cells": [
        "ContactName",
        "Num"
      ],
      "line": 16,
      "id": "create-order;create-order;;1"
    },
    {
      "cells": [
        "Helloworld",
        "010101010"
      ],
      "line": 17,
      "id": "create-order;create-order;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Create_Order",
  "description": "",
  "id": "create-order;create-order;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "The user in the Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on start ordering button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Choose Delviery Area",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "add an item with quantity 3 to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Enter \"Helloworld\",\"010101010\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter Address Info \"\u003cBlockno\u003e\",\"\u003cstreetno\u003e\",\"\u003cHouseno\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click Place order button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Order Placed Succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateOrder_Steps.the_user_in_the_Home_page()"
});
formatter.result({
  "duration": 12769027300,
  "status": "passed"
});
formatter.match({
  "location": "CreateOrder_Steps.i_click_on_start_ordering_button()"
});
formatter.result({
  "duration": 4607900,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "CreateOrder_Steps.add_an_item_with_quantity_to_the_cart(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Helloworld",
      "offset": 12
    },
    {
      "val": "010101010",
      "offset": 25
    }
  ],
  "location": "CreateOrder_Steps.user_Enter(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CreateOrder_Steps.click_Place_order_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateOrder_Steps.order_Placed_Succesfully()"
});
formatter.result({
  "status": "skipped"
});
});