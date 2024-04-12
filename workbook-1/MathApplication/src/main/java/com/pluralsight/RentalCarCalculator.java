package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfDays;
        String pickupDate;
        String gps;
        double gpsAmt = 2.95;
        String roadSide;
        double tollTagAmt = 3.95;
        int age;
        double basicCarRental = 29.99;
        double surchargeCost = 0.3;
        double totalcost = 0.0;

        System.out.println("What day do you need your rental? ");
        pickupDate = scanner.nextLine();
        input.nextLine();
        System.out.println("How long will you need the rental? ");
        numberOfDays = scanner.nextInt();
        System.out.println("Would you like an electronic toll tag? ($3.95) ");
        tollTag = scanner.nextLine();
        switch(tollTagAmt){
            case "yes":
                rentalCost = totalcost + (tollTagAmt);
                break;
        System.out.println("Would you like a GPS? ($2.95) ");
        gps = scanner.nextLine();
        switch(gps){
            case "yes":
                rentalCost = totalcost + (gpsAmt);
                break;
        }
        System.out.println("Would you like roadside assistance? ($3.95) ");
        roadSide = input.nextLine();
        System.out.println("How old are you? ");
        age = input.nextInt();
    }
}
