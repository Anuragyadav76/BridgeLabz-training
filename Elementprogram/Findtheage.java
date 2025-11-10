public class FindTheAge {
    public static void main(String args[]){
        int birth_year=2000;
        int current_year=2024;
        int age=current_year-birth_year;
        System.out.println("Harry's age in current year : "+age);
    }
    
}

public class FindTheAge {
    public static void main(String[] args) {
        // Sam's marks in PCM
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate total and average
        int total = maths + physics + chemistry;
        double average = total / 3.0;

        // Display the result
        System.out.println("Sam’s average mark in PCM is " + average + "%");
    }
}

public class FindTheAge {
    public static void main(String[] args) {
        // Distance in kilometers
        double kilometers = 10.8;

        // Conversion factor
        double conversionFactor = 1.6;

        // Convert to miles
        double miles = kilometers * conversionFactor;

        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}


public class FindTheAge {
    public static void main(String[] args) {
        // Given values
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        // Display all results in a single print statement
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}


public class FindTheAge {
    public static void main(String[] args) {
        // Total pens and students
        int totalPens = 14;
        int students = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Display result in a single print statement
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}


public class FindTheAge {
    public static void main(String[] args) {
        // Original course fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Display result in a single print statement
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

public class FindTheAge {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor: 1 kilometer = 0.621371 miles
        double kmToMiles = 0.621371;

        // Volume of Earth in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMiles;

        // Volume of Earth in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

import java.util.Scanner;

public class FindTheAge {
    public static void main(String[] args) {
        // Create Scanner object to take input from keyboard
        Scanner input = new Scanner(System.in);

        // Declare variable to store kilometers
        double km;

        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  // Read input from user

        // Conversion factor
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}

import java.util.Scanner;

public class FindTheAge {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double fee;
        double discountPercent;

        // Take user input for fee and discount percentage
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}


import java.util.Scanner;

public class FindTheAge {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Declare variable for height in cm
        double heightCm;

        // Prompt user for input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}