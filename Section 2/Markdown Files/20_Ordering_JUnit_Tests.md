# 20. Ordering JUnit Tests - Overview

1. In General 
    1. Order should not be a factor in unit tests 
    2. There should be no dependency between tests 
    3. All tests should pass regardless of the order in which they are run 

2. But there are some use cases where you want to control the order 
    1. You want tests to appear in alphabeticla order for reporting purposes 
    2. Sharing reports with project management, QA team, etc
    3. Group tests based on functionality or requirements

3. From the **Junit User Guide**
    1. By default, test classes and methods will be ordered using an algorithm that is deterministic but intentionally nonobvious

| Annotation | Description |
| -------- | ------- |
| @TestMethodOrder | Configures the order/sort algorithm for the test methods |

### Specify Method Order 

| Name | Description |
| -------- | ------- |
| MethodOrderer.DisplayName | Sorts test methods alphanumerically based on display names |
| MethodOrderer.MethodName | Sorts test methods alphanumerically based on method names(Only useful when not using @DisplayName)|
| MethodOrderer.Random | Pseudo-random order based on method names <br> (Make sure all of your tests pass regardless of order. Confirms no dependencies between tests) <br> (We can also use DisplayNames here since everything is random and order doesn't matter)|
| MethodOrderer.OrderAnnotation | Sorts test methods numerically based on @Order annotation |


### Another Method we can use 

**NOTE** - **Remember for this case, the lowest number has the highest priority**

| Annotation | Description |
| -------- | ------- |
| @Order | Manually specify the order with an int number <br> - Order with lowest number has highest priority <br> - Negative numbers are allowed|

**Question** - What about the methods that don't have any order's on them
1. They kinda will just follow the undocumented/unpublished algorithm, but intentionally none obvious




