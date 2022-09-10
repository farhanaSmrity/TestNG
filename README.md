# TestNG

Prerequisite :
1. Java install & JAVA_HOME configure.
2. Gradle install & GRADLE_HOME configure.
3. Allure configure.

Command on terminal:
For run -
gradle clean test
For generate report -
1. allure generate allure-results --clean -o allure-report
2. allure serve allure-results 

Description : 
An E-Commerce site is automated by using Selenium TestNG framework with POM structure. 
1. Sign Up by filling up all fields including mandatory & optional. automate to generate random data for fields - email, phone number, mobile during each Sign Up time.
2. Every time registered customer is listed on an array which is on separate folder.
3. Log In each time with last registered customer.
4. Purchase a product with search.
5. 3 positive & 2 negative test cases. assertion is added to all test cases. 
6. Can run test cases individually by using Test Runner (created) or all by using Test Suite (created).
7. Used priority & groups as per how I  want to run test cases.
8. Used allure to generate reports after test.
