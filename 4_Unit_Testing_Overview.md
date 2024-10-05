####  How do we do Manual Testing 
1. Write the Code 
2. Run the Code 
3. Examine Results 

**NOTE**:- But the above method is good if so the codebase is very small 

what if you have a **Large CodeBase**
1. Requires human interaction and analysis - which is not possible manually 
2. Some bugs which occurs at very minor situations which cannot be reproduced again 
3. There is no way to Automate the test 

#### Why we go for **Unit Testing**
1. Testing an individual code for the correctness
2. Provide fixed inputs to a method in a code 
3. We expect a known output here

#### An Example 
Suppose say i have a method Calculator 
``` Java
add(int x,int y) : int
```

#### We build up a battery or collection of tests below
Say i want to check whether this method is working (or) not, i write some test case like 
1. add(5,2) -> Check whether i get 7 as output **(both positives)**
2. add(-3,-8) -> check whether i get -11 as output **(both negatives)**
3. add(-3,1) -> check whether i get -1 as output **(One negative and one positive)**
4. add(0,0) -> check whether i get 0 as my answer **(Both zeroes)**


#### What can you do with the Help of UNIT TESTING
With the help of **Unit Testing**, even though the developer who is responsible (or) who developed the code is not available right now also. You would be able to know/test whether the code works properly or not with the help of **Unit Testing**

#### Benefits of Unit Testing 
1. Automated Tests 
2. Better Code Design 
3. Fewer Bugs and higher reliability 
4. Increases confidence for code refactoring... did i break anything ?
5. Basic requirement for    
    1. Devops
    2. Continuous Integration/ Continuous Deployement(CI/CD)


#### Integration Testing 
1. This is a phase where we test multiple components together as a part of a test plan
2. Here we just determine, whether the software units work together as expected
3. Identify any negative side effects due to integration 
4. Can test using mocks/stubs
5. Can also test using  live integrations (database, file systems)


#### Popular Unit Testing Frameworks 

1. JUnit   
    1. Supports creating Test Cases 
    2. Automation of test case with pass/fail 
    3. Utilities for test setup, teardown and assertions 
2. Mockito 
  1. Create Mocks and stubs
  2. Minimize dependencies on external components 




