package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName;
        String array[];

        System.out.print("Enter your name!: ");
        fullName = scanner.nextLine();
        fullName = fullName.trim();
        array = fullName.split(" ");

        if (array.length == 2) {
            System.out.println("First Name:" + array[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name:" + array[1]);
        } else {
            System.out.println("First name: " + " " + array[0]);
            System.out.println("Middle name: " + " " + array[1]);
            System.out.println("Last name: " + " " + array[2]);
        }
    }
}
