package Person;
import Location.Location;
public class PersonFactory {

    private static PersonFactory instance = null;  // single instance
    private static int unique_id_counter = 0;      // unique IDs

    private PersonFactory() { }

    public static PersonFactory getInstance() {
        if (instance == null) {
            instance = new PersonFactory();
        }
        return instance;
    }

    public Person createPerson(PersonData _person_data, Location _location,boolean _is_child) {
        Person new_person;
        if (_is_child){
            new_person = new Child();
        }
        else{
            new_person = new Person();
        }
        new_person.is_child = _is_child;
        new_person.setPersonId(unique_id_counter);
        new_person.setLocation(_location);
        _location.addPerson(new_person);
        new_person.setPersonRole(_person_data.personRole);
        new_person.setPersonState(_person_data.personState);
        new_person.setAge(_person_data.age);
        new_person.setName(_person_data.name);
        new_person.setHeight(_person_data.height);
        new_person.setBirthDate(_person_data.birthDate);
        new_person.setPhoneNumber(_person_data.phoneNumber);
        unique_id_counter++;
        return new_person;
    }
}
