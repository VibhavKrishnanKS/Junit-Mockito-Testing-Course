# 8. JUnit Assertions - Equals/NotEquals and Null/NotNull - Overview

1. We create a **DemoUtilsTest File** under the directory   
    1. **test->java-> {with the same package name as src->main}**
2. There whatever can be the method name but it should have the Test annotation contained in it 

### Taking the First Example - assertEquals, assertNotEquals
```Java
    // Testing the add method
    @Test
    void testEqualsAndNotEquals(){
        // Creating an instance of the class which you want to test
        DemoUtils demoUtils = new DemoUtils();

        // The test below will pass, if so the two values are equal. Else it will display the desired message
        assertEquals(6,demoUtils.add(2,4), "2+4 must be 6");
        //// The test below will pass, if so the two values are not equal. Else it will display the desired message
        assertNotEquals(6,demoUtils.add(1,9), "1 + 9 must not be 6");

    }
```
> In the above code, the two values refer to    
    1. Expected value(Which is the first parameter for assertEquals)  
    2. Expected value(which is the first parameter for asserNotEquals)  
    3. The method call(which is the second paramter for both the function calls) 
>

### Taking the Second example - for Null and NotNull

```Java
// We take a method in DemoUtils.java and break the code on purpose - The code will return NULL always
    public Object checkNull(Object obj) {
        return null;
//        if (obj != null) {
//            return obj;
//        }
//        return null;
    }

    // Now if we run this below code
    @Test
    void testNullAndNotNull(){
        DemoUtils demoUtils = new DemoUtils();
        String str1 =null;
        String str2 = "Vibhav";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        // The code below return an error
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }
```
> Why the particular line returns an error  
    Because we modified/broke down the code to return NULL irrespective of the value that is passed  
    So the below statement returns a null
> 

And Now we Modify the code back to normal
``` Java
    public Object checkNull(Object obj) {
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Test
    void testNullAndNotNull(){
        DemoUtils demoUtils = new DemoUtils();
        String str1 =null;
        String str2 = "Vibhav";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }
```
> Now the below code will be thro'and all the conditions gets passed

f



