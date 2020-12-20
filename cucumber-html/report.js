$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/login.feature");
formatter.feature({
  "name": "Swiggy website Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.scenario({
  "name": "The SignUp Functions to Swiggy Users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the Swiggy Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignUp.the_user_is_already_on_the_swiggy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on SignUp",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignUp.user_click_on_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be go to SignUp Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignUp.user_should_be_redirected_to_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Sign up the user to the Swiggy website",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The user is already on the Signup page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" \"\u003cName\u003e\" \"\u003cEmail\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Click Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Phone",
        "Name",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "1234568591",
        "Terry",
        "Terry@xyz.com",
        "Test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Sign up the user to the Swiggy website",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is already on the Signup page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignUp.the_user_is_already_on_the_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1234568591\" \"Terry\" \"Terry@xyz.com\" and \"Test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignUp.user_enters_something_something_something_and_something(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "SwiggySignUp.user_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignUp.user_should_be_able_to_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Provide the Kolkatta address",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is already on the Signup Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignUp.user_is_already_on_the_Signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Kolkatta",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignUp.user_click_on_Kolkatta()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user end testing",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignUp.user_end_testing()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});