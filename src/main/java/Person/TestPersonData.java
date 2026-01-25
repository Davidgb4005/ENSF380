package Person;

import java.util.Vector;
public class TestPersonData {
    public static final Vector<PersonData> PEOPLE = new Vector<>(java.util.List.of(
            new PersonData("Alice", Gender.FEMALE, "1990-01-01", "555-1234", 1, 33, 165, 60, PersonState.DEAD, PersonRole.CIVILIAN),
            new PersonData("Bob", Gender.MALE, "1985-05-12", "555-5678", 2, 38, 180, 75, PersonState.INJURED, PersonRole.VOLUNTEER),
            new PersonData("Charlie", Gender.MALE, "2000-07-20", "555-9012", 3, 23, 175, 70, PersonState.MISSING, PersonRole.STAFF),
            new PersonData("Diana", Gender.FEMALE, "1995-03-14", "555-1111", 4, 28, 170, 65, PersonState.INVOLVED, PersonRole.STAFF),
            new PersonData("Ethan", Gender.MALE, "1978-11-02", "555-2222", 5, 45, 182, 85, PersonState.UNINVOLVED, PersonRole.CIVILIAN),
            new PersonData("Fiona", Gender.FEMALE, "2002-09-09", "555-3333", 6, 21, 160, 55, PersonState.INVOLVED, PersonRole.VOLUNTEER)
    ));

}
