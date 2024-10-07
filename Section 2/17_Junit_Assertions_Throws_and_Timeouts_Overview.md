# 17. JUnit Assertions - Throws and Timeouts - Overview

| Name | Description |
| -------- | ------- |
| assertThrows | Assert that an executable throws an exception of expected type|
| assertDoesNotThrow | Assert that an executable should not throw an exception of expected type|

### We have a method in our DemoUtils.java which throws an exception for any values that is less than zero 
```JAva
    public String throwException(int a) throws Exception {
        if (a < 0) {
            throw new Exception("Value should be greater than or equal to 0");
        }
        return "Value is greater than or equal to 0";
    }
    // We can add out respective test function for this
```

| Name | Description |
| -------- | ------- |
| assertTimeoutPreemptively | Assert that an executable completes before given timeout is exceeded (or) else the execution is preemptively aborted if timeout is exceeded|
```Java
// We want to make sure that this method doesn't oversleep 
    public void checkTimeout() throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(2000);
        System.out.println("Sleeping over");
    }
``

