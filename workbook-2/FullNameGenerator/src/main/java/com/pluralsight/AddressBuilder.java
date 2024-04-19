package com.pluralsight;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder data = new StringBuilder();
        String fullName, billingStreet, billingCity, billingState, billingZip, shippingStreet, shippingCity, shippingState, shippingZip;

        System.out.print("What is your name?: ");
        fullName = scanner.nextLine();
        System.out.print("Billing Street: ");
        billingStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        billingCity = scanner.nextLine();
        System.out.print("Billing State: ");
        billingState = scanner.nextLine();
        System.out.print("Billing Zip: ");
        billingZip = scanner.nextLine();
        System.out.print("Shipping Street: ");
        shippingStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        shippingCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        shippingState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        shippingZip = scanner.nextLine();


        data.append("Full Name: " + fullName + "\n");
        data.append("Billing Street: " + billingStreet + "\n");
        data.append("Billing City: " + billingCity + "\n");
        data.append("Billing State: " + billingState + "\n");
        data.append("Billing Zip: " + billingZip + "\n");
        data.append("\n" + "Shipping Street: " + shippingStreet + "\n");
        data.append("Shipping City: " + shippingCity + "\n");
        data.append("Shipping State " + shippingState + "\n");
        data.append("Shipping Zip " + shippingZip);

        String myData = data.toString();
        System.out.println(myData);
    }
}
