package org.TravelPackage;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;  // Reference to the destination

    // Constructor
    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setDestination(Destination destination){
        if(this.destination == null ){
            this.destination = destination;
        } else {
            System.out.println("The activity, " + name + " already has a destination, " + destination + "\n");
        }
    }

    // setting the destination for once
    public Destination getDestination(){
        return destination;
    }
}
