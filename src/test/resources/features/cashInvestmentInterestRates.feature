@CashInvestmentsInterestRates
  Feature: Request interest rates email notifications
    Scenario Outline: User request for interest rates alerts
      Given User opens investec website
      And User clicks on search
      And User enters "<SearchKeyWord>" search key word
      And User clicks search button
      And User click understanding cash investment interest rates
      And User clicks Sign up Button
      And User enters name"<name>"
      And User enters surname"<surname>"
      And User enters email"<email>"
      And User selects insights
      And User clicks submit button

      Then verify that "<VerifyText>" text is displayed

Examples:
      |SearchKeyWord                               |name |surname|email              |VerifyText|
      |Understanding cash investment interest rates|Jerry|Shongwe|test@investec.co.za|Thank you |


