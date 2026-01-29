package Person;

import java.util.Vector;
import Location.Location;

public class Person {
    public enum PersonState {
        INJURED,
        MISSING,
        DEAD,
        INVOLVED,
        UNINVOLVED
    }
    public enum PersonRole {
        STAFF,
        VOLUNTEER,
        CIVILIAN
    }
    public enum Gender{
        MALE,
        FEMALE,
        OTHER,
        NONE
    }
    protected String name;
    protected Gender gender;
    protected String birthDate;
    protected String phoneNumber;
    protected int person_id;
    protected int age;
    protected int height;
    protected int weight;
    protected boolean is_child;

    private PersonState personState;
    private PersonRole personRole;


    protected Person(){};
    private Vector<Person> relatives = new Vector<>();
    private Location location;

    public String getName(){
        return name;
    }

    public void setName(String _name){
        this.name = _name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isChild(){
        return is_child;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public Vector<Person> getRelatives() {
        return relatives;
    }

    public void setRelatives(Vector<Person> relatives) {
        this.relatives = relatives;
    }

    public  String getLocation() {
        return location.getAddress();
    }

    public void setLocation(Location _location) {
        this.location = _location;
    }

    public int getPersonId(){
        return person_id;
    }
    public void setPersonId(int _person_id){
       person_id = _person_id;
    }
}

