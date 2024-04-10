package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        /*
        Question 1:
        declare variables here
        then code solution
        then use System.out.println() to display results
        ex: System.out.println("The answer is " + answer);

        REPEAT FOR NEXT EXERCISE
         */
        double bobSalary = 5000;
        double garySalary = 2000;
        // highest salary
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Highest salary = $" + highestSalary);

        // car price and truck price
        double carPrice = 10000;
        double truckPrice = 13000;
        // smallest price
        double smallestPrice = Math.min(carPrice, truckPrice);
            System.out.println("Smallest price = $" + smallestPrice);

            // circle
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle with radius = " + radius + " is " + area);

        // square root
        double thing = 5.0;
        double sqRoot = Math.sqrt(thing);
        System.out.println("The square root of 5.0 is = " + sqRoot);

        // distance
        double x1  = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        double distance = Math.sqrt((x1 - x2)*(x1 - x2) + (y2 - y1)*(y2 - y1));
        System.out.println("The distance between the points is = " + distance);

        // absolute value
        double absoluteValue = -3.8;
        double display = Math.abs(3.8);
        System.out.println("The absolute value of -3.8 is = " + display);

        // random number
        double number = Math.random();
        System.out.println("Random number between 0-1 = " + number);


        }
    }
