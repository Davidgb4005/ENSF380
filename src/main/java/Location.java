import java.util.Vector;

public class Location {

    private String phoneNumber;
    private String address;
    private Person locationCaptain;
    private Vector<Person> occupants = new Vector<>();
    private DisasterStrategy response;

    // ===== Core methods =====

    // Add a person to the location
    public void addPerson(Person person) {
        person.setLocation(this);
        occupants.add(person);
    }

    // Remove a person from the location
    public void removePerson(Person person) {
        occupants.remove(person);
    }

    // Check if a person is in the location
    public boolean hasOccupant(Person person) {
        return occupants.contains(person);
    }

    // Set disaster strategy
    public void setDisasterStrategy(DisasterStrategy strategy) {
        this.response = strategy;
    }

    // Find an occupant by name
    public void findOccupant(String name) {
        for (Person p : occupants) {
            if (name.equals(p.getName())) {
                System.out.println(name + " is at " + this.address);
                return;
            }
        }
        System.out.println(name + " not found at this location.");
    }

    // Trigger evacuation strategy
    public void evacuationStrategy() {
        if (response != null) {
            response.evacuationStrategy();
        }
    }

    // Trigger emergency broadcast
    public void emergencyBroadcast() {
        if (response != null) {
            response.emergencyBroadcast();
        }
    }

    // ===== Getters and Setters =====

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
        return new Vector<>(occupants); // return a copy for safety
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
