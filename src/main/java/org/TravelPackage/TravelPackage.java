package org.TravelPackage;
import java.util.*;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    // Constructor
    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = new ArrayList<>();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    // Add a passenger to the travel package
    public void addPassenger(Passenger passenger) {
        if(passengers.contains(passenger)){
            System.out.println("Passenger " + passenger.getName() + " is already part of " + name + "\n");
        } else {
            if (passengers.size() < passengerCapacity) {
                passengers.add(passenger);
            } else {
                System.out.println("Cannot add more passengers. The travel package is full.\n");
            }
        }
    }

    // Print itinerary of the travel package
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        System.out.println("Destinations and Activities:");
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("  Activity: " + activity.getName());
                System.out.println("    Cost: " + activity.getCost());
                System.out.println("    Capacity: " + activity.getCapacity());
                System.out.println("    Description: " + activity.getDescription());
            }
        }
        System.out.println("\n");
    }

    // Print passenger list of the travel package
    public void printPassengerList() {
        System.out.println("Passenger List for Travel Package: " + name);
        System.out.println("Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger: " + passenger.getName() + " (Number: " + passenger.getPassengerNumber() + ")");
        }
        System.out.println("\n");
    }

    // Print details of activities with available spaces
    public void printAvailableActivities() {
        System.out.println("Available Activities in Travel Package: " + name);
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getCapacity() - countPassengersForActivity(activity);
                if (availableSpaces > 0) {
                    System.out.println("Destination: " + destination.getName());
                    System.out.println("Activity: " + activity.getName());
                    System.out.println("Available Spaces: " + availableSpaces);
                    System.out.println();
                }
            }
        }
        System.out.println("\n");
    }

    // Helper method to count the number of passengers signed up for a specific activity
    private int countPassengersForActivity(Activity activity) {
        int count = 0;
        for (Passenger passenger : passengers) {
            if (passenger.getActivities().contains(activity)) {
                count++;
            }
        }
        return count;
    }

}

