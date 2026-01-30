import java.util.Vector;
import Location.*;
import Person.*;
import UserStrategys.*;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Facade and Strategies
        DisasterResponseFacade myApi = new DisasterResponseFacade();

        DisasterStrategy strat1 = myApi.registerDisasterStrategy(new BlizzardStrategy(), "Blizzard Strat");
        DisasterStrategy strat2 = myApi.registerDisasterStrategy(new FireStrategy(), "Fire Strat");
        DisasterStrategy strat3 = myApi.registerDisasterStrategy(new FloodStrategy(), "Flood Strat");
        DisasterStrategy strat4 = myApi.registerDisasterStrategy(new EarthquakeStrategy(), "Earthquake Strat");

        // 2. Setup Locations
        for (LocationData ld : DummyTestData.LOCATIONS) {
            Location myLocation = myApi.newLocation(ld);
            myApi.setLocationStrategy(myLocation, strat1);
        }

        // 3. Populate People
        int count = 0;
        for (PersonData pd : DummyTestData.PEOPLE) {
            count++;
            // Distribution logic: person goes to a location based on count
            // isChild is true if count is even
            myApi.newPerson(pd, myApi.getLocation(count % 5), (count % 2 == 0));
        }
        // 4. Test Execution & Output
        System.out.println("--- Triggering Evacuation ---");
        myApi.getLocation(1).evacuationStrategy();

        System.out.println("\n--- Searching for Alice ---");
        Vector<Person> aliceResults = myApi.getPersonByName("Alice", null);
        for (Person p : aliceResults) {
            System.out.println(p.getName() + "   " + p.getLocation());
        }

        System.out.println("\n--- Checking Children ---");
        Vector<Child> children = myApi.getChildren(null);
        for (Child c : children) {
            System.out.println(c.getName() + "   Is Child: " + c.isChild());
        }
    }
}