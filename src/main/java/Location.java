import java.util.Vector;

public class Location {

    private String phoneNumber;
    private String address;
    private Person locationCaptain;
    private Vector<Person> occupants = new Vector<>();
    private DisasterStrategy response;


    public Location(){
    }
    public void addPerson(Person person) {
        person.setLocation(this);
        occupants.add(person);
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

    public void findOccupant(String name) {
        for (Person p : occupants) {
            if (name.equals(p.getName())) {
                System.out.println(name + " is at " + this.address);
                return;
            }
        }
        System.out.println(name + " not found at this location.");
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
