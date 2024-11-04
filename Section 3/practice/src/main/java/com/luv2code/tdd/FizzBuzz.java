package com.luv2code.tdd;

public class FizzBuzz {
    // 1. If number divisible by 3 - print Fizz
    // 2. If number divisible by 5 - print Buzz
    // 3. If number divisible by 3 and 5 - print FizzBuzz
    // 4. If number not divisible by 3 or 5 - print The Number

//    public static String compute(int i) {
//        if(i % 5 == 0 && i % 3 == 0){
//            return "FizzBuzz";
//        }else if(i % 3 == 0){
//            return "Fizz";
//        }else if(i % 5 == 0){
//            return "Buzz";
//        }else{
//            return Integer.toString(i);
//        }
//    }

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
}
