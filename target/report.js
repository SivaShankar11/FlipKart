$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/flipkart.feature");
formatter.feature({
  "name": "flipkart site automation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tagflipkartfeature"
    }
  ]
});
formatter.scenario({
  "name": "Add an item to the cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tagflipkartfeature"
    },
    {
      "name": "@tag1additemaddtocart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartStepDefinition.launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username password",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartStepDefinition.user_enters_username_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartStepDefinition.clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the data on the search bar",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartStepDefinition.user_enters_the_data_on_the_search_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartStepDefinition.clicks_on_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the item",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartStepDefinition.clicks_on_the_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on the add to cart button",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartStepDefinition.clicks_on_the_add_to_cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates the order by the place order text",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartStepDefinition.user_validates_the_order_by_the_place_order_text()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});