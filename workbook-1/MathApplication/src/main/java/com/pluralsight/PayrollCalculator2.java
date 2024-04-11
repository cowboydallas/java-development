package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // Name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Howdy " + name);

        // Hours worked
        float hours = ask ("How many hours have you worked?", "Hours worked: ");


        // Pay rate;
        float pay = ask ("What is your pay rate? ", "Pay rate: ");
        hoursAndPay(hours, pay);
    }
        public static void hoursAndPay(float num1, float num2) {
        float grossPay = num1 * num2;
        System.out.println(grossPay);
        }
        public static float ask(String question, String output) {
        System.out.println(question);
        float num1 = scanner.nextFloat();
        System.out.println(output + num1);
        return num1;
        }
}
