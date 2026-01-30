package Location;

import Person.PersonFactory;

public class LocationFactory {

    // 1. Fields / State
    private static LocationFactory instance = null;
    private static int uniqueIdCounter = 0;

    // 2. Private Constructor
    private LocationFactory() { }

    // 3. Instance Accessor (Singleton)
    public static LocationFactory getInstance() {
        if (instance == null) {
            instance = new LocationFactory();
        }
        return instance;
    }

    // 4. Core Factory Logic
    public Location createLocation(LocationData locationData) {
        Location tempLocation = new Location(uniqueIdCounter++);

        tempLocation.setLocationCaptain(locationData.locationCaptain);
        tempLocation.setAddress(locationData.address);
        tempLocation.setPhoneNumber(locationData.phoneNumber);

        return tempLocation;
    }
}