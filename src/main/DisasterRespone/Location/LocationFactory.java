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

    public Location CreateLocation(LocationData _location_data){
        Location temp_location = new Location(unique_id_counter++);
        temp_location.setLocationCaptain(_location_data.locationCaptain);
        temp_location.setAddress(_location_data.address);
        temp_location.setPhoneNumber(_location_data.phoneNumber);
        return temp_location;
    }
}
