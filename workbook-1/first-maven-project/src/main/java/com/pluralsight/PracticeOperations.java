package com.pluralsight;

public class PracticeOperations {
    public static void main(String args[]) {
        String word1 = "Hi";
        String word2 = "there!";
        String word3 = " bye";
        String completedWord = word1 + word2 + word3;
        System.out.println(completedWord);

        // doubles
        double firstValue = 5.3748328468273;
        double secValue = 3.00;
        double thirdValue = 2.0;

        /* Now we need another double that will hold the calculation of the results
        Addition:
         */
        double result = firstValue + secValue + thirdValue;
        System.out.println(result);
        // Subtraction:
        result = firstValue - secValue - thirdValue;
        System.out.println(result);
        // Multiplication:
        result = firstValue * secValue * thirdValue;
        System.out.println(result);
        // Division:
        result = firstValue / secValue / thirdValue;
        double accumulation = result + 10;
        System.out.println(accumulation);
        accumulation =  accumulation + 100; // accumulation means adding to what is already there.
        System.out.println(accumulation);
        accumulation = accumulation + 1000;
        System.out.println(accumulation);
    }
}
