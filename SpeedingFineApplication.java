package com.mycompany.speedingfineapplication;

import java.util.Scanner;

/**
 * Author: Suwen_Byrow
 * Date: August 13, 2025
 * Console app that calculates the fine for a citizen caught speeding in a 120km/h zone.
 */
public class SpeedingFineApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the speed (km/h): ");
        int speed = scanner.nextInt();

        SpeedingFines speedingFine = new SpeedingFines(name, speed);

        System.out.println("*");
        speedingFine.printFine();
        System.out.println("*");

        scanner.close();
    }
}
