# 40. Parameterized Tests - Overview

1. What if We'd like to pass in a collection of values and expected results 
2. Run the same test in a loop 

A. One possible Solution which we can do is - Create a 2d Array and pass the values in a **For Loop**


### JUnit provides @Parameterized Test
1. Run a test Multiple times and provide different parameter values
    1. Behind the scenes, JUnit will run the test multiple times and supply the data - Junit will do all the looping work for you in the background '


### Source of Values
1. When using @ParameterizedTest, where can we get the values?

| Month    | Savings |
| -------- | ------- |
| @ValueSource | Array of values:String,ints,doubles,floats,etc |
| @CsvSource | Array of CSV String Values |
| @CsvFileSource | CSV values read from a file |
| @EnumSource | Enum Constant values |
| @MethodSource | Custom method for providing values |

### ParameterizedTest - @CsvSource
**NOTE** - For this data the **0th(0th Column) index** will be the **Value** and the **first(first column) index** will be the **expected value**
1. Examples for a CSV source - Do this in the practical Video
2. We can also customize **Invocation names**
3. We can also read a CSV file from our system and thereby pass it to our method **(The Annotations will change a little)** - We reference the csv file using **@CsvFileSource** Annotation
