### In this video, we wil cover about the concept of Assertions 

#### JUnit has a collection of Assertions
1. Defined in class: org.junit.jupiter.api.Assertions
  - assertEquals - Assert that the values are equal 
  - assertNotEquals - Assert that the values are not equal 
  - assertNull - Assert that the value is NULL 
  - aassertNotNul - Assert that the value is NOT NULL 


## Method 1
#### assertEquals
```Java
Assertions.assertEquals(expected,actual,"2+4 must be 6");
```
Three Parameters
1. expected - This is the **expected value**
2. actual - This is the **Actual Value after executing method unduer test**
3. "2+4  must be 6" - This is the **optional message if the test fails**

## Method 2
#### assertNotEquals 
```Java
Assertions.assertNotEquals(unexpected,actual, "2+4 must not be 6");
```
Three Parameters
1. unexpected - This is the **unexpected value**
2. actual - This is the **Actual Value after executing method unduer test**
3. "2+4  must be 6" - This is the **optional message if the test fails**

#### Example Code - Static Import 
A short-cut for referencing static methods & fields in a class
### BEFORE
```Java
import org.junit.jupiter.api.Assertions;
// For this we have to use 
Assertions.assertEquals() // The same three parameters
Assertions.assertNotEquals() // The same three paramters
```
### AFTER 
```Java
import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions.assertNotEquals;
```
### Another Method - This is a wildcard method
```Java
// The * imports all the required packages from the Assertions library
import orh.junit.jupiter.api.Assertions.*;
// If so we import the wildcard like above 
assertEquals() // The same 3 parameters as i discussed above
assertNotEquals() // The same 3 parameters as i discussed above
```



