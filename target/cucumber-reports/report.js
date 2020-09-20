$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cashInvestmentInterestRates.feature");
formatter.feature({
  "line": 2,
  "name": "Request interest rates email notifications",
  "description": "",
  "id": "request-interest-rates-email-notifications",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CashInvestmentsInterestRates"
    }
  ]
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User request for interest rates alerts",
  "description": "",
  "id": "request-interest-rates-email-notifications;user-request-for-interest-rates-alerts",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User opens investec website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on search",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters \"\u003cSearchKeyWord\u003e\" search key word",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click understanding cash investment interest rates",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks Sign up Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters name\"\u003cname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters surname\"\u003csurname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters email\"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User selects insights",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify that \"\u003cVerifyText\u003e\" text is displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "request-interest-rates-email-notifications;user-request-for-interest-rates-alerts;",
  "rows": [
    {
      "cells": [
        "SearchKeyWord",
        "name",
        "surname",
        "email",
        "VerifyText"
      ],
      "line": 19,
      "id": "request-interest-rates-email-notifications;user-request-for-interest-rates-alerts;;1"
    },
    {
      "cells": [
        "Understanding cash investment interest rates",
        "Jerry",
        "Shongwe",
        "test@investec.co.za",
        "Thank you"
      ],
      "line": 20,
      "id": "request-interest-rates-email-notifications;user-request-for-interest-rates-alerts;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "User request for interest rates alerts",
  "description": "",
  "id": "request-interest-rates-email-notifications;user-request-for-interest-rates-alerts;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@CashInvestmentsInterestRates"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User opens investec website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on search",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Understanding cash investment interest rates\" search key word",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User clicks search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click understanding cash investment interest rates",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks Sign up Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters name\"Jerry\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters surname\"Shongwe\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters email\"test@investec.co.za\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User selects insights",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks submit button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify that \"Thank you\" text is displayed",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "cashInvestmentInterestRates.userOpensInvestecWebsite()"
});
formatter.result({
  "duration": 7679386700,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userClicksOnSearch()"
});
formatter.result({
  "duration": 619562800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Understanding cash investment interest rates",
      "offset": 13
    }
  ],
  "location": "cashInvestmentInterestRates.userEntersSearchKeyWord(String)"
});
formatter.result({
  "duration": 1741578600,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userClicksSearchButton()"
});
formatter.result({
  "duration": 4119879500,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userClickUnderstandingCashInvestmentInterestRates()"
});
formatter.result({
  "duration": 3257368700,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userClicksSignUpButton()"
});
formatter.result({
  "duration": 2033008200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jerry",
      "offset": 17
    }
  ],
  "location": "cashInvestmentInterestRates.userEntersName(String)"
});
formatter.result({
  "duration": 1367295800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shongwe",
      "offset": 20
    }
  ],
  "location": "cashInvestmentInterestRates.userEntersSurname(String)"
});
formatter.result({
  "duration": 266506600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@investec.co.za",
      "offset": 18
    }
  ],
  "location": "cashInvestmentInterestRates.userEntersEmail(String)"
});
formatter.result({
  "duration": 318031200,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userSelectsInsights()"
});
formatter.result({
  "duration": 226818800,
  "status": "passed"
});
formatter.match({
  "location": "cashInvestmentInterestRates.userClicksSubmitButton()"
});
formatter.result({
  "duration": 802553100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thank you",
      "offset": 13
    }
  ],
  "location": "cashInvestmentInterestRates.verifyThatTextIsDisplayed(String)"
});
formatter.result({
  "duration": 1429107100,
  "status": "passed"
});
});