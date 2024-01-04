import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.TravelPackage.*;
import java.util.*;

public class DestinationTest {
    @Test
    void destinationCreation() {
        Activity activity = new Activity("Sightseeing", "Explore landmarks", 50.0, 20);
        Destination destination = new Destination("City A", List.of(activity));
        assertNotNull(destination,"Checking if NULL");
        assertEquals("City A", destination.getName(),"Checking Destination name");
        assertEquals(1, destination.getActivities().size(),"Checking if Activities got added");
        assertEquals(activity, destination.getActivities().get(0),"Checking the Activity added");
    }
}
