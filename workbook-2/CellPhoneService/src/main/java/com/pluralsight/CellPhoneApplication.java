package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone cellphone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Serial number: ");
        long serialNumber = Long.parseLong(scanner.nextLine());
        cellphone1.setSerialNumber(serialNumber);
        System.out.println("Model: ");
        String model = scanner.nextLine();
        cellphone1.setModel(model);
        System.out.println("Carrier: ");
        String carrier = scanner.nextLine();
        cellphone1.setCarrier(carrier);
        System.out.println("Phone #: ");
        String phoneNumber = scanner.nextLine();
        cellphone1.setPhoneNumber(phoneNumber);
        System.out.println("Owner: ");
        String owner = scanner.nextLine();
        cellphone1.setOwner(owner);
        scanner.nextLine();
        System.out.println();
    }
    public static void display(CellPhone phone){
        System.out.println("Your serial number is " + phone.getSerialNumber());
        System.out.println("Your model is " + phone.getModel());
        System.out.println("Your carrier is " + phone.getCarrier());
        System.out.println("Your phone number is " + phone.getPhoneNumber());
        System.out.println("The owner is " + phone.getOwner());
    }

}
