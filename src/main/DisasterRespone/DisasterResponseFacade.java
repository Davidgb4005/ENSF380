import Person.*;
import Location.*;
import java.util.Vector;

public class DisasterResponseFacade {
    //Public API Function
    private Vector<Location> location_list = new Vector<Location>();
    private Vector<DisasterStrategy> disasterStrategies = new Vector<DisasterStrategy>();
    private LocationFactory locationFactory;
    private PersonFactory personFactory;
    //Constructor
    public DisasterResponseFacade(){
        //Init Of All Singlton Factorys
        locationFactory = LocationFactory.getInstance();
        personFactory = PersonFactory.getInstance();
    }

    public Location getLocation(int _id){
        for (Location l : location_list){
            if (l.getLocationid() == _id){
                return l;
            }
        }
        return null;
    }
    public Location NewLocation(LocationData _location_data){
        Location temp_location = locationFactory.CreateLocation(_location_data);
        location_list.add(temp_location);
        return temp_location;
    }
    public int DestroyLocation(){
        return -1;//Check how to Properly Delete in Java
    }
    public void SetLocationStrategy(Location location,DisasterStrategy strategy){
        location.setDisasterStrategy(strategy);
    }

    public Person NewPerson(PersonData _person_data,Location _location,boolean _is_child){
        Person temp_person = personFactory.createPerson(_person_data, _location,_is_child);
        return temp_person;
    }
    public Vector<Person> getPersonByName(String _name,Vector<Location> _location){
        Vector<Person> person_matchs = new Vector<Person>();
        Vector<Location>locations_to_search = _location;

        if ( _location == null){
            locations_to_search = location_list;
        }
        for (Location l :locations_to_search){
            Vector<Person> occupants = l.getOccupants();
            for (Person p : occupants) {
                if (p.getName().equals(_name)){
                    person_matchs.add(p);
                }
            }
        }
        return person_matchs;
    }
    public Vector<Child> getChildren(Vector<Location> _location){
        Vector<Child> person_matchs = new Vector<Child>();
        Vector<Location>locations_to_search = _location;

        if ( _location == null){
            locations_to_search = location_list;
        }
        for (Location l :locations_to_search){
            Vector<Person> occupants = l.getOccupants();
            for (Person p : occupants) {
                if (p.isChild()){
                    person_matchs.add((Child)p);
                }
            }
        }
        return person_matchs;
    }
    public void TransferPerson(Person person,Location src, Location dest){
        src.deletePerson(person);
        dest.addPerson(person);
    }

    public DisasterStrategy registerDisasterStratgy(DisasterStrategy _strategy , String _name){
        disasterStrategies.add(_strategy);
        _strategy.setStrategyName(_name);
        return _strategy;
    }
    public DisasterStrategy getStrategyByName(String _name){
        for (DisasterStrategy s : disasterStrategies){
            if (s.getStrategyName().equals(_name)){
                return s;
            }
        }
        return null;
    }
}
