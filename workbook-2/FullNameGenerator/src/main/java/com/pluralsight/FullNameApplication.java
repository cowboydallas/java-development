package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName, middleName, lastName, suffix, fullName = "";

        System.out.println("Enter your full name!");

        System.out.print("What is your first name? ");
        firstName = scanner.nextLine();
        firstName = firstName.trim();
        System.out.print("What is your middle name? (Leave blank if none) ");
        middleName = scanner.nextLine();
        middleName = middleName.trim();
        System.out.print("What is your last name? ");
        lastName = scanner.nextLine();
        lastName = lastName.trim();
        System.out.print("What is your suffix? (Leave blank if none) ");
        suffix = scanner.nextLine();

        if (middleName.isEmpty()){
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        if (!(suffix.isEmpty())) {
            fullName = fullName + ", " + suffix;

            System.out.println("Your full name is " + fullName);
        }
    }
}