# 39. FizzBuzz Project - Coding - Refactoring 

```Java    
    // Trying a different solution
    public static String compute(int i){
        StringBuilder result = new StringBuilder();

        if(i % 3 == 0){
            result.append("Fizz");
        }
        if(i % 5 == 0){
            result.append("Buzz");
        }
        if(result.isEmpty()){
            result.append(i);
        }
        return result.toString();
    }
```
### Explanation
![Copilot Explanation for the Above Code Part 1](../images/39_Refactoring_Copilot.png)
![Copilot Explanation for the Above Code Part 2](../images/39_Refactoring_Copilot_1.png)