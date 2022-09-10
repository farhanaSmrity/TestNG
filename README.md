# TestNG

### Prerequisite :
- Java install & JAVA_HOME configure.
- Gradle install & GRADLE_HOME configure.
- Allure configure.

### Command on terminal:

For run -

`gradle clean test`

For generate report -
```powershell
allure generate allure-results --clean -o allure-report
allure serve allure-results
```

### Description : 
An E-Commerce site is automated by using __Selenium TestNG framework with POM structure__.
1. Sign Up by filling up all fields including mandatory & optional. automate to generate random data for fields - __email, phone number, mobile during each Sign Up time__.
2. Every time registered customer is listed on an array which is on separate file.
3. Log In each time with last registered customer.
4. Purchase a product by searching it.
5. __3 positive & 2 negative test cases. assertion is added to all test cases__. 
6. Can run test cases individually by using __Test Runner (created) or all by using Test Suite (created)__.
7. Used __priority & groups__ as per how I  want to run test cases.
8. Used __allure__ to generate reports after test.
9. ![Report]
(https://user-images.githubusercontent.com/48954330/189478636-344be8fe-8adf-4073-8439-3a3f19215bad.png)
