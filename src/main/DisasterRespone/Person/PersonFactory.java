package Person;

import Location.Location;

public class PersonFactory {

    // 1. Fields / State
    private static PersonFactory instance = null;
    private static int uniqueIdCounter = 0;

    // 2. Private Constructor
    private PersonFactory() { }

    // 3. Instance Accessor (Singleton)
    public static PersonFactory getInstance() {
        if (instance == null) {
            instance = new PersonFactory();
        }
        return instance;
    }

    // 4. Core Factory Logic
    public Person createPerson(PersonData personData, Location location, boolean isChild) {
        Person newPerson;

        // Determine polymorphic type
        if (isChild) {
            newPerson = new Child();
        } else {
            newPerson = new Person();
        }

        // Apply metadata and identity
        newPerson.isChild = isChild;
        newPerson.setPersonId(uniqueIdCounter++);

        // Establish location relationship
        newPerson.setLocation(location);
        location.addPerson(newPerson);

        // Map data from PersonData object
        newPerson.setPersonRole(personData.personRole);
        newPerson.setPersonState(personData.personState);
        newPerson.setAge(personData.age);
        newPerson.setName(personData.name);
        newPerson.setHeight(personData.height);
        newPerson.setBirthDate(personData.birthDate);
        newPerson.setPhoneNumber(personData.phoneNumber);

        return newPerson;
    }
}