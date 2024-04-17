package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the date of the show? (MM/dd/YYYY): ");
        String fullName;
        String array[];
        String input = scanner.nextLine();

        String[] date = input.split("/");
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // LocalDate night = LocalDate.parse(date, formatter);


        System.out.println("How many tickets needed?: ");
        scanner.nextLine();

        System.out.println("What is your name?: ");
        fullName = scanner.nextLine().trim();


        array = fullName.split(", ");

        System.out.println("# ticket(s) reserved for " + " under " + array[1] + ", " + array[0]);
    }
}
