# investecJerryShongweAssesment

I created the automation using a maven project and java
The API test can only be run using the UnitTest java test. 
mvn test run both the UI and the API)
The front-end test can be run using the UnitTest class and it can also run using testRunner class which is located inside the Runner package. testRunner runs the project using Cucumber BDD(Behaviour-driven development)
I created a separate class for each page of the application. The classes are in the investecWeb package
The API class is in the investecAPI package
Test data can be specified in the feature file under ‘Example’
Feature file is in the features package in the test folder
Step definition class in located in the stepdefinations package 
environment.properties file contain environment variables like urls, endpoint and browser
The ChromeDriver version is 85.0.4183.87
Screenshots are stored in the screenshots folder inside the project
Webdrivers are in the resources folder under drivers
Screenshots are stored in the screenshots folder
A folder is created inside screenshots folder on each test iteration to store screenshots for that specific run
See 'Investec assessment screenshots' for the local run screenshots
Cucumber repots are stored in the target folder target/cucumber-reports
