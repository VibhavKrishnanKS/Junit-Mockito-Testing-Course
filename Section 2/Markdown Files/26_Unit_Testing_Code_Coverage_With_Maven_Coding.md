# 26. Unit Testing Code Coverage With Maven - Coding Part 1

1. Before you add the surefire Plugin, if you run the command - **mvn clean test** - you will get that **Tests run: 0** (as you didn't add the surefire plugin)

In order to overcome this problem, we then add the specific surefire package in the pom.xml
```XML
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
```
After adding the above respective package once after this if we run the command - **mvn clean test** then our command runs all the test 
then the **Tests run:10**

