package Location;

import Person.Person;

public class LocationData {

    // 1. Fields / State
    public String phoneNumber;
    public String address;
    public Person locationCaptain;

    // 2. Constructor
    public LocationData(String phoneNumber, String address, Person locationCaptain) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.locationCaptain = locationCaptain;
    }
}