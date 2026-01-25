package Location;

import Person.PersonFactory;

public class LocationFactory {

    private static LocationFactory instance = null;  // single instance
    private static int unique_id_counter = 0;      // unique IDs

    private LocationFactory() { }

    public static LocationFactory getInstance() {
        if (instance == null) {
            instance = new LocationFactory();
        }
        return instance;
    }

    public Location CreateLocation(){
        return new Location(unique_id_counter++);
    }
}
