package org.TravelPackage;

import java.util.*;

public class Destination {
    private String name;
    private List<Activity> activities;

    // Constructor
    public Destination(String name, List<Activity> activities) {
        this.name = name;
        for(int i=0; i<activities.size(); i++){
            Activity activity = activities.get(i);
            if(activity.getDestination() == null){
                activity.setDestination(this);
            }
            else {
                System.out.println(activity.getName() + " is already part of " + activity.getDestination().getName() + "\n");
                activities.remove(i);

            }
        }
        this.activities = activities;

    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void addActivities(Activity activity){
        this.activities.add(activity);
    }

}
