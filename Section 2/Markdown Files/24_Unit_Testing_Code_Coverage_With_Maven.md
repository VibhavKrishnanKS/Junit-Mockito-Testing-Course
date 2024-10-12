# 24. Unit Testing Code Coverage with Maven - Overview - Part 1

1. **Step 1** - Maven will NOT find JUnit 5 test classes
    1. At Command line type **mvn clean test**  
        We have to configure Maven to find unit tests - We can do this by adding **Maven SureFire Plugin** version 22.0 (or) higher
    2. we can add **Maven SureFire-Report plugin** - which helps us to generate HTML unit test report
    3. Add the respective files in the **pom.xml** in order for Maven to detect the unit classes - For the pom.xml code refer to the next video Markdown
2. After completing all the above commands, we have to run two commands now in order to generate a report 
    1. mvn clean test - We need to generate the test report 
    2. mvn site -DegenerateReports=false - This helps us not to overwrite the existing report and also helps us to add extra CSS styling for our pages
3. These files are generated in the target directory - 
    1. File - target/site/sunfire-report.html
4. Handling Test Failures
    1. **By Default** - **Maven Sunfire** plugin will NOT Generate reports if the test fails
    2. To generate reports if tests pass or fail
        1. For this inside the **pom.xml** - you have to set the **testFailureIgnore** attribue in the XML file to true - This says that we have to generate reports if tests pass or fail
5. By default, **Maven surface plugin** will NOT show **@DisplayName** in reports 
    1. So in order to show **@DisplayName** in reports  
        1. We will set the attribute(**usePhrasedTestCaseMethodName**) in the xml file to **true**