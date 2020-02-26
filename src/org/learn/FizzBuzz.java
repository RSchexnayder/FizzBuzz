package org.learn;

public class FizzBuzz {
    public static void run() {
        for (int i = 1; i <= 100; i++) {
            if (isMultipleOfThree(i) && !isMultipleOfFive(i)){
                System.out.println("Fizz");
            } else if (!isMultipleOfThree(i) && isMultipleOfFive(i)){
                System.out.println("Buzz");
            } else if (isMultipleOfThree(i) && isMultipleOfFive(i)){
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isMultipleOfThree(int i){
        if (i % 3 == 0){
            return true;
        }
        return false;
    }

    public static boolean isMultipleOfFive(int i){
        if (i % 5 == 0){
            return true;
        }
        return false;
    }
}
