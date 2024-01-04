import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.TravelPackage.*;
import java.util.*;

public class PassengerTest {
    @Test
    void passengerCreation() {
        Passenger passenger = new Passenger("John", 101, PassengerType.GOLD, 100.0);
        assertNotNull(passenger);
        assertEquals("John", passenger.getName());
        assertEquals(101, passenger.getPassengerNumber());
        assertEquals(100.0, passenger.getBalance(), 0.01);
        assertEquals(PassengerType.GOLD, passenger.getType());
        assertEquals(0, passenger.getActivities().size());
    }

    @Test
    void signUpForActivityGoldPassenger() {
        Destination destination = new Destination("City A", List.of());
        Activity activity = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        Passenger passenger = new Passenger("John", 101, PassengerType.GOLD,  100.0) ;

        passenger.signUpForActivity(activity);

        assertEquals(1, passenger.getActivities().size());
        assertEquals(activity, passenger.getActivities().get(0));
        assertEquals(55.0, passenger.getBalance(), 0.01); // 10% discount applied
    }

    @Test
    void signUpForActivityStandardPassengerWithBalance() {
        Destination destination = new Destination("City A", List.of());
        Activity activity = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        Passenger passenger = new Passenger("John", 101,PassengerType.STANDARD, 100.0);

        passenger.signUpForActivity(activity);

        assertEquals(1, passenger.getActivities().size());
        assertEquals(activity, passenger.getActivities().get(0));
        assertEquals(50.0, passenger.getBalance(), 0.01); // Activity cost deducted
    }

    @Test
    void signUpForActivityStandardPassengerWithoutBalance() {
        Destination destination = new Destination("City A", List.of());
        Activity activity = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        Passenger passenger = new Passenger("John", 101, PassengerType.STANDARD,  40.0);

        passenger.signUpForActivity(activity);

        assertEquals(0, passenger.getActivities().size());
        assertEquals(40.0, passenger.getBalance(), 0.01); // Balance remains unchanged
    }
}
