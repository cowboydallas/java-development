package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // Name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Howdy " + name);

        // Hours worked
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many hours have you worked? ");
        float hours = scanner.nextFloat();
        System.out.println("Hours worked = " + hours);

        // Pay rate
        Scanner payScanner = new Scanner(System.in);
        System.out.println("What is your pay rate? ");
        float pay = scanner.nextFloat();
        System.out.println("Gross pay = " + pay * hours);
    }
}
