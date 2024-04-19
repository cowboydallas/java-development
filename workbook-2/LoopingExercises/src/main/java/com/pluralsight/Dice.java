package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int sum, roll1, roll2, countTwo = 0, countFour = 0, countSix = 0, countSeven = 0;

        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;
            System.out.println("Roll " + (i + 1) + ":\t" + roll1 + " - " + roll2 + "\t Sum: " + sum);

            if (sum == 2) {
                countTwo++;
            } else if (sum == 4) {
                countFour++;
            } else if (sum == 6) {
                countSix++;
            } else if (sum == 7) {
                countSeven++;
            }
        }
        System.out.println("Two counter: " + countTwo);
        System.out.println("Four counter: " + countFour);
        System.out.println("Six counter: " + countSix);
        System.out.println("Seven counter: " + countSeven);

        }

    private int roll() {
        return 0;
    }
}