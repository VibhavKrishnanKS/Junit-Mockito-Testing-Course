# 9. Test Case Lifecycle Methods - Overview

While developing tests, we have to perform common operations
1. Before Each test
    1. Create Objects, set up test data 
2. After Each test
    1. Release resources, clean up test data



| Annotation | Description |
| -------- | ------- |
| @BeforeEach | Method is executed before each test method.<br> Useful for common set up code: creating object, setting up test data|
| @AfterEach | Method is executed after each test method.<br> Useful for common clean up code: releasing resources, cleaning up test data|

### Execution Sequence 

@BeforeEach -> @TestMethodOne -> @AfterEach    
**Similarly**  
@BeforeEach -> @TestMethodTwo -> @AfterEach


### Sometimes, 

1. While developing tests, we may need to perform **one-time operations**   
    1. One-time set up before all tests  
        1. Get database connections, connect to remote servers
    2. One-time clean up after all tests
        1. Release database connection, disconnect from remote servers 

### By default, the below given two methods must be static
| Annotation | Description |
| -------- | ------- |
| @BeforeAll | Method is executed only once, before all test methods.<br> Useful for getting database connections, disconnecting from servers|
| @AfterAll | Method is executed only oWnce, after all test method.<br> Useful for releasing database connections, disconnecting from servers|

### Execution Sequence 
@BeforeAll ->
@BeforeEach -> @TestMethodOne -> @AfterEach  -> @BeforeEach -> @TestMethodTwo -> @AfterEach -> 
@AfterAll


