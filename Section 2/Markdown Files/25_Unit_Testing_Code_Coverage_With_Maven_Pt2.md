# 25. Unit Testing Code Coverage with Maven - Overview - Part 2

**Step 4:** In order to generate Code Coverage Reports 
**JaCoCo** - Java Code Coverage
1. We use **JaCoCo** - this is a **free code coverage library**
2. **JaCoCo** provides a Maven plugin to generate code coverage reports

Then add the respecitve imports to the **pom.xml** file 

After which now if you run - **mvn clean test**

We can find the converage reports -   
**File** - target/site/jacoco/index.html
