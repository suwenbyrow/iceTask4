package com.mycompany.speedingfineapplication;

/**
 * Represents a speeding fine for a citizen.
 */
public class SpeedingFines implements IFine {

    private String citizenName;
    private int speed;

    public SpeedingFines(String citizenName, int speed) {
        this.citizenName = citizenName;
        this.speed = speed;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public int getSpeed() {
        return speed;
    }

    public double getFinePayable() {
        int speedLimit = 120;
        int overSpeed = speed - speedLimit;

        if (overSpeed <= 0) {
            return 0.0;
        }
        return overSpeed * 75.0;
    }

    @Override
    public void printFine() {
        System.out.println("CITIZEN: " + getCitizenName());
        System.out.println("SPEED: " + getSpeed() + " km/h");

        if (getFinePayable() > 0) {
            System.out.printf("FINE PAYABLE: R %.2f\n", getFinePayable());
        } else {
            System.out.println("No fine payable.");
        }
    }
}
