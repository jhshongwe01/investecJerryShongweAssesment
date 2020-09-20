# investecJerryShongweAssesment

I created the automation using a maven project and java
The Api test can only be run using the UnitTest java test. Run the apiTest method (mvn test will run both the UI and the API)
The front-end test can be run using the UnitTest class and it can also be run using BDD using the testRunner class which is located inside the Runner package.
I created a separate class for each page of the application.The classes are located in the investecWeb package
The API class is in the investecAPI package
Test data is hard coded in the UnitTest however test data can be changed in the feature file under example.
Feature file is located in the features package in the test folder
Step defination class in located in the stepdefinations package 
environment.properties file contain environment variables like urls, endpoint and browser
The ChromeDriver version is 85.0.4183.87
Screenshots are stored in the screenshots folder inside the project
Webdrivers are in the resources folder under drivers
Screenshots are stored in the screenshots folder
A folder is created inside screenshots folder on each test interation to store screenshots for that specific run
See 'Investec assessment sreenshots' for the local run screenshots
