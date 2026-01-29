package Location;

import Person.*;

import java.util.Vector;

public class Location {

    private String phoneNumber;
    private String address;
    private Person locationCaptain;
    private int location_id;
    private Vector<Person> occupants = new Vector<>();
    public DisasterStrategy response;


    protected Location(int _location_id){
        location_id = _location_id;
    }
    public void addPerson(Person person) {
        person.setLocation(this);
        occupants.add(person);
    }
    public void deletePerson(Person person){
        person.setLocation(null);
        occupants.remove(person);
    }
    public int getLocationid(){
        return location_id;
    }
    public void removePerson(Person person) {
        occupants.remove(person);
    }

    public boolean hasOccupant(Person person) {
        return occupants.contains(person);
    }

    public void setDisasterStrategy(DisasterStrategy strategy) {
        this.response = strategy;
    }

    public Person findOccupant(int _id ) {
        for (Person p : occupants) {
            if (p.getPersonId() == _id) {
                return p;
            }
        }
        System.out.println("Person Does Not Exist At this Destination");
        return null;
    }

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
}
