# 43 FizzBuzz Main App Coding 

Once we are done with writing all the test for the FizzBuzz application we write the main code for our application

```Java
public class MainApp {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            // We don't need the numbers from 1 to 100
//            System.out.println(i + "," + FizzBuzz.compute(i));
            // They are asking us for the FizzB
            // uzz numbers from 1 to 100, so we print only the FizzBuzz numbers
            System.out.println(FizzBuzz.compute(i));
        }
    }
}
```
> Yeah the above code will print the FizzBuzz numbers from 1 to 100