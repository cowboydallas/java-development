package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice, age;
        String loaded;
        System.out.println("Thank you for shopping with Sam's Sandwiches.");
        System.out.println("Would you like a regular(1) or large(2) sandwich? ");
        choice = input.nextInt();
        input.nextLine();
        System.out.println("Do you want a loaded sandwich? Yes or no" );
        loaded = input.nextLine();
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        sandwichCost(choice, loaded, age);
    }

    public static void sandwichCost(int userChoice, String loaded, int age) {
        double basePrice = 0;
        double discount = 0;
        double cost = 0;
        if (loaded.equals("yes")) {
            if (userChoice == 1) {
                basePrice = 6.45;
            } else if (userChoice == 2) {
                basePrice = 10.70;
            } else {
                basePrice = 0;
            }
        } else {
            if (userChoice == 1) {
                basePrice = 5.45;
            } else if (userChoice == 2) {
                basePrice = 8.95;
            } else {
                basePrice = 0;
            }

            if (age <= 17) {
                discount = 0.1;
            } else if (age >= 65) {
                discount = 0.2;
            } else {
                cost = basePrice;
            }
            System.out.println("The cost of your sandwich is " + cost);
        }
    }
}