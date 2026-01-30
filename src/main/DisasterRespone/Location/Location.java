package Location;

import Person.*;
import java.util.Vector;

public class Location {

    // 1. Fields / State
    private int locationId;
    private String phoneNumber;
    private String address;
    private Person locationCaptain;
    private Vector<Person> occupants = new Vector<>();
    public DisasterStrategy response;

    // 2. Constructor
    protected Location(int locationId) {
        this.locationId = locationId;
    }

    // 3. Occupant Management Logic
    public void addPerson(Person person) {
        person.setLocation(this);
        occupants.add(person);
    }

    public void removePerson(Person person) {
        occupants.remove(person);
    }

    public void deletePerson(Person person) {
        person.setLocation(null);
        occupants.remove(person);
    }

    public boolean hasOccupant(Person person) {
        return occupants.contains(person);
    }

    public Person findOccupant(int id) {
        for (Person p : occupants) {
            if (p.getPersonId() == id) {
                return p;
            }
        }
        System.out.println("Person Does Not Exist At this Destination");
        return null;
    }

    // 4. Disaster Strategy Execution
    public void evacuationStrategy() {
        if (response != null) {
            response.evacuationStrategy();
        }
    }

    public void emergencyBroadcast() {
        if (response != null) {
            response.emergencyBroadcast();
        }
    }

    // 5. Getters and Setters
    public int getLocationid() {
        return locationId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getLocationCaptain() {
        return locationCaptain;
    }

    public void setLocationCaptain(Person locationCaptain) {
        this.locationCaptain = locationCaptain;
    }

    public Vector<Person> getOccupants() {
        return new Vector<>(occupants);
    }

    public void setOccupants(Vector<Person> occupants) {
        this.occupants = occupants;
    }

    public DisasterStrategy getResponse() {
        return response;
    }

    public void setResponse(DisasterStrategy response) {
        this.response = response;
    }

    public void setDisasterStrategy(DisasterStrategy strategy) {
        this.response = strategy;
    }
}