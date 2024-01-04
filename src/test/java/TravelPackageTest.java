import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.TravelPackage.*;
import java.util.*;

public class TravelPackageTest {
    @Test
    void travelPackageCreation() {
        Destination destination = new Destination("City A", List.of());
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 30, List.of(destination));

        assertNotNull(travelPackage);
        assertEquals("Summer Vacation", travelPackage.getName());
        assertEquals(30, travelPackage.getPassengerCapacity());
        assertEquals(1, travelPackage.getItinerary().size());
        assertEquals(destination, travelPackage.getItinerary().get(0));
        assertEquals(0, travelPackage.getPassengers().size());
    }

    @Test
    void addPassengerToTravelPackage() {
        Destination destination = new Destination("City A", List.of());
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 2, List.of(destination));
        Passenger passenger1 = new Passenger("John", 101, PassengerType.GOLD, 100.0);
        Passenger passenger2 = new Passenger("Alice", 102,PassengerType.STANDARD,  80.0);

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        assertEquals(2, travelPackage.getPassengers().size());
        assertEquals(passenger1, travelPackage.getPassengers().get(0));
        assertEquals(passenger2, travelPackage.getPassengers().get(1));
    }

    @Test
    void addExceedingPassengerToTravelPackage() {
        Destination destination = new Destination("City A", List.of());
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 1, List.of(destination));
        Passenger passenger1 = new Passenger("John", 101,PassengerType.GOLD,  100.0);
        Passenger passenger2 = new Passenger("Alice", 102,PassengerType.STANDARD,  80.0);

        travelPackage.addPassenger(passenger1);
        travelPackage.addPassenger(passenger2);

        assertEquals(1, travelPackage.getPassengers().size());
        assertEquals(passenger1, travelPackage.getPassengers().get(0));
    }

    @Test
    void printAvailableActivitiesInTravelPackage() {
        Destination destination1 = new Destination("City A", List.of());
        Destination destination2 = new Destination("City B", List.of());
        Activity activity1 = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        Activity activity2 = new Activity("Hiking", "Enjoy nature trails", 30.0, 15);
        TravelPackage travelPackage = new TravelPackage("Summer Vacation", 30, List.of(destination1, destination2));

        travelPackage.printAvailableActivities();

        Passenger passenger = new Passenger("John", 101, PassengerType.GOLD, 100.0);
        passenger.signUpForActivity(activity1);
        travelPackage.addPassenger(passenger);

        travelPackage.printAvailableActivities(); // Should now show available spaces for activity2
    }
}
