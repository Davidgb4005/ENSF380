package Person;

import java.util.Vector;
import Location.Location;

public class Person {

    // 1. Enums
    public enum PersonState {
        INJURED, MISSING, DEAD, INVOLVED, UNINVOLVED
    }

    public enum PersonRole {
        STAFF, VOLUNTEER, CIVILIAN
    }

    public enum Gender {
        MALE, FEMALE, OTHER, NONE
    }

    // 2. Fields / State
    protected String name;
    protected Gender gender;
    protected String birthDate;
    protected String phoneNumber;
    protected int personId;
    protected int age;
    protected int height;
    protected int weight;
    protected boolean isChild;

    private PersonState personState;
    private PersonRole personRole;
    private Vector<Person> relatives = new Vector<Person>();
    private Location location;

    // 3. Constructor
    protected Person() {}

    // 4. Relationship & Specialized Logic
    public String getLocation() {
        return (location != null) ? location.getAddress() : "No Location Set";
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Vector<Person> getRelatives() {
        return relatives;
    }

    public void setRelatives(Vector<Person> relatives) {
        this.relatives = relatives;
    }

    // 5. Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChild() {
        return isChild;
    }

    public void setIsChild(boolean isChild) {
        this.isChild = isChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PersonState getPersonState() {
        return personState;
    }

    public void setPersonState(PersonState personState) {
        this.personState = personState;
    }

    public PersonRole getPersonRole() {
        return personRole;
    }

    public void setPersonRole(PersonRole personRole) {
        this.personRole = personRole;
    }
}