1. Step 1 - Add Maven Dependencies for JUnit   
Add the respective dependencies in **pom.xml**

2. Create Test Package
The code we are testing in package:   **com.lub2code.junitdemo**
    1. A Convention is to create test classes in similar package structure under **Test Folder**

3. Create Unit Test
    1. **SetUp** - Create instance of the class to test
    2. **Execute** - Call the method you want to test 
    3. **Assert** - Check the result and verify that it is the expected result
```Java
package com.luv2code.junitdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DemoUtilstest{
    @Test
    void testEqualAndNotEquals(){
      // set up 
      // Create an instance of the class to test
      DemoUtils demoUtils = new DemoUtils();
      int expected = 6;

      // execute 
      // Call the method you want to test 
      int actual = demoUtils.add(2,4);

      // Assert
      // Check the actual result and verify that it is the expected result
      Assertions.assertEquals(expected, actual, "2+4 must be 6");
    }
}
```

4. Run Unit Test  
    1. Run the Unit test, in order to check whether the test passed or not