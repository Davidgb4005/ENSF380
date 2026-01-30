package Location; // Assuming this lives in your main logic package

import Person.*;
import Location.*;
import java.util.Vector;

public class DisasterResponseFacade {

    // 1. Fields / State
    private Vector<Location> locationList = new Vector<>();
    private Vector<DisasterStrategy> disasterStrategies = new Vector<>();
    private LocationFactory locationFactory;
    private PersonFactory personFactory;

    // 2. Constructor
    public DisasterResponseFacade() {
        // Init Of All Singleton Factories
        this.locationFactory = LocationFactory.getInstance();
        this.personFactory = PersonFactory.getInstance();
    }

    // 3. Location Management
    public Location newLocation(LocationData locationData) {
        Location tempLocation = locationFactory.createLocation(locationData);
        locationList.add(tempLocation);
        return tempLocation;
    }

    public Location getLocation(int id) {
        for (Location l : locationList) {
            if (l.getLocationid() == id) {
                return l;
            }
        }
        return null;
    }

    public int destroyLocation() {
        // In Java, "deletion" is handled by removing all references 
        // to an object so the Garbage Collector can reclaim it.
        return -1;
    }

    // 4. Person Management
    public Person newPerson(PersonData personData, Location location, boolean isChild) {
        return personFactory.createPerson(personData, location, isChild);
    }

    public void transferPerson(Person person, Location src, Location dest) {
        src.deletePerson(person);
        dest.addPerson(person);
    }

    // 5. Search Logic
    public Vector<Person> getPersonByName(String name, Vector<Location> locations) {
        Vector<Person> personMatches = new Vector<>();
        Vector<Location> locationsToSearch = (locations == null) ? locationList : locations;

        for (Location l : locationsToSearch) {
            for (Person p : l.getOccupants()) {
                if (p.getName().equals(name)) {
                    personMatches.add(p);
                }
            }
        }
        return personMatches;
    }

    public Vector<Child> getChildren(Vector<Location> locations) {
        Vector<Child> childrenFound = new Vector<>();
        Vector<Location> locationsToSearch = (locations == null) ? locationList : locations;

        for (Location l : locationsToSearch) {
            for (Person p : l.getOccupants()) {
                if (p.isChild()) {
                    childrenFound.add((Child) p);
                }
            }
        }
        return childrenFound;
    }

    // 6. Strategy Management
    public DisasterStrategy registerDisasterStrategy(DisasterStrategy strategy, String name) {
        strategy.setStrategyName(name);
        disasterStrategies.add(strategy);
        return strategy;
    }

    public void setLocationStrategy(Location location, DisasterStrategy strategy) {
        location.setDisasterStrategy(strategy);
    }

    public DisasterStrategy getStrategyByName(String name) {
        for (DisasterStrategy s : disasterStrategies) {
            if (s.getStrategyName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}