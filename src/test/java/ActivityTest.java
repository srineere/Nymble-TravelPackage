import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.TravelPackage.*;
import java.util.*;

public class ActivityTest {
    @Test
    void activityCreation() {
        Activity activity = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        assertNotNull(activity);
        assertEquals("Sightseeing", activity.getName(),"Checking Name");
        assertEquals("Explore landmarks", activity.getDescription(),"Checking Description");
        assertEquals(50.0, activity.getCost(), 0.01,"Checking Cost");
        assertEquals(20, activity.getCapacity(),"Checking Capacity");
    }

    @Test
    void checkIfDuplicateDestinations(){
        Activity activity = new Activity("Hiking", "Enjoy nature trails", 30.0, 15);
        List<Activity> activitiesDestination = new ArrayList<>();
        activitiesDestination.add(activity);
        Destination destination1 = new Destination("City A", activitiesDestination);
        Destination destination2 = new Destination("City B", activitiesDestination);
        assertEquals("City A", activity.getDestination().getName(),"Checking if Destination changed");
    }
}