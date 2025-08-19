package com.mycompany.speedingfinesreport;

/**
 * Author: Suwen_Byrow
 * Date: 8/13/2015_11:09
 * This program uses a two-dimensional array to produce a speeding fines report,
 * including the highest and lowest fines recorded.
 */
public class SpeedingFinesReport {

    public static void main(String[] args) {
        String[] cities = {"JHB", "DBN", "CTN", "PE"};
        String[] months = {"JAN", "FEB", "MAR"};
        int[][] speedingFines = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185},
            {195, 155, 221}
        };

        System.out.println("*");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("*");

        // Print header row
        System.out.print("      ");
        for (String month : months) {
            System.out.printf("%-8s", month);
        }
        System.out.println();

        // Print table values
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-6s", cities[i]);
            for (int j = 0; j < months.length; j++) {
                System.out.printf("%-8d", speedingFines[i][j]);
            }
            System.out.println();
        }

        // Find min & max
        int maxSpeed = speedingFines[0][0];
        int minSpeed = speedingFines[0][0];

        for (int[] speedingFine : speedingFines) {
            for (int fine : speedingFine) {
                if (fine > maxSpeed) {
                    maxSpeed = fine;
                }
                if (fine < minSpeed) {
                    minSpeed = fine;
                }
            }
        }

        System.out.println("\n*");
        System.out.println("SPEEDING FINES STATISTICS");
        System.out.println("*");
        System.out.println("Maximum speed captured: " + maxSpeed + " km/h");
        System.out.println("Minimum speed captured: " + minSpeed + " km/h");
    }
}
