import org.TravelPackage.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create activities
        Activity activity1 = new Activity("Sightseeing", "Explore famous landmarks", 50.0, 20);
        Activity activity2 = new Activity("Hiking", "Enjoy nature trails", 30.0, 15);
        Activity activity3 = new Activity("Beach Relaxation", "Sunbathe on sandy beaches", 40.0, 25);
        Activity activity4 = new Activity("Water Sports", "Try exciting water activities", 60.0, 10);

        // Create destinations
        List<Activity> activitiesDestination1 = new ArrayList<>();
        activitiesDestination1.add(activity1);
        activitiesDestination1.add(activity2);
        Destination destination1 = new Destination("City A", activitiesDestination1);

        List<Activity> activitiesDestination2 = new ArrayList<>();
        activitiesDestination2.add(activity3);
        activitiesDestination2.add(activity4);
        activitiesDestination2.add(activity1);
        Destination destination2 = new Destination("Beach Town B", activitiesDestination2);

        // Create travel package
        List<Destination> itinerary = new ArrayList<>();
        itinerary.add(destination1);
        itinerary.add(destination2);

        TravelPackage travelPackage = new TravelPackage("Summer Vacation Package", 30, itinerary);

        // Printing Itinerary
        travelPackage.printItinerary();

        // Create passengers
        Passenger passenger1 = new Passenger("John", 101, PassengerType.GOLD, 100.0);
        Passenger passenger2 = new Passenger("Alice", 102, PassengerType.STANDARD, 80.0);
        Passenger passenger3 = new Passenger("Kent", 103, PassengerType.PREMIUM);

        // Add passengers to the travel package
        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger2);
        travelPackage.addPassenger(passenger3);

        // Signing up passengers for activities
        passenger1.signUpForActivity(activity2);
        passenger1.signUpForActivity(activity3);

        passenger2.signUpForActivity(activity2);
        passenger2.signUpForActivity(activity4);

        passenger3.signUpForActivity(activity1);
        passenger3.signUpForActivity(activity2);
        passenger3.signUpForActivity(activity3);
        passenger3.signUpForActivity(activity4);

        // Print passenger details
        passenger1.printDetails();
        passenger2.printDetails();
        passenger3.printDetails();

    }
}