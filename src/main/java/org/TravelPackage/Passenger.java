package org.TravelPackage;

import java.util.*;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType type;
    private List<Activity> activities;

    // Constructors
    public Passenger(String name, int passengerNumber, PassengerType type, double balance) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = balance;
        this.activities = new ArrayList<>();
    }
    public Passenger(String name, int passengerNumber, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = type;
        this.balance = Double.MAX_VALUE;
        this.activities = new ArrayList<>();
    }
    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.type = PassengerType.PREMIUM;
        this.balance = Double.MAX_VALUE;
        this.activities = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public PassengerType getType() {
        return type;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    // Sign up for an activity
    public void signUpForActivity(Activity activity) {
        if (type == PassengerType.PREMIUM || (type == PassengerType.GOLD && balance >= activity.getCost() * 0.9) || (type == PassengerType.STANDARD && balance >= activity.getCost())) {
            activities.add(activity);
            if (type == PassengerType.GOLD) {
                balance -= activity.getCost() * 0.9; // Apply 10% discount for gold passengers
            } else if (type == PassengerType.STANDARD) {
                balance -= activity.getCost();
            }
        } else {
            System.out.println("Insufficient balance for " + name + " to sign up for the activity " + activity.getName() + "\n");
        }
    }

    // Additional methods for printing details
    public void printDetails() {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Passenger Type: " + type);
        if(type!=PassengerType.PREMIUM){
            System.out.println("Balance: " + balance);
        }
        System.out.println("Activities signed up for:");
        for (Activity activity : activities) {
            System.out.println("  Activity: " + activity.getName() + " at Destination: " + activity.getDestination().getName());
            if (type == PassengerType.GOLD) {
                System.out.println("    Price Paid: " + (activity.getCost() * 0.9) + " (10% discount applied)");
            } else if (type == PassengerType.STANDARD) {
                System.out.println("    Price Paid: " + activity.getCost());
            }

        }
        System.out.println("\n");
    }
}
