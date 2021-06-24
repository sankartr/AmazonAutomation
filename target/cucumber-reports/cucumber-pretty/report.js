$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/User_loginDetails.feature");
formatter.feature({
  "name": "Check user able to Login in Amazon",
  "description": "   check user able to search the item\n   As a user of google\n   In order to select item and add to cart\n   verify",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User able login and search Item and add to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is Logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "UserLogin.user_is_Logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter \"shirt for man\" in search textbox",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.search_item(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add item to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.addItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add item to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.addItemtoCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.proceedtoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter invalid email \"sankar@test.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "UserLogin.enterEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the error message \"We cannot find an account with that email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserLogin.checkError(String)"
});
formatter.result({
  "status": "passed"
});
});