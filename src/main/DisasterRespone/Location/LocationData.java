package Location;
import Person.Person;
import java.util.Vector;

public class LocationData {
        public String phoneNumber;
        public String address;
        public Person locationCaptain;
    public LocationData(String _phonenumber, String _address, Person _locationCaptiain){
       this.phoneNumber = _phonenumber;
       this.address = _address;
       this.locationCaptain =  _locationCaptiain;
    }
}