package Person;

public class PersonData {

    // 1. Fields / State
    public String name;
    public Person.Gender gender;
    public String birthDate;
    public String phoneNumber;
    public int personId;
    public int age;
    public int height;
    public int weight;
    public Person.PersonState personState;
    public Person.PersonRole personRole;

    // 2. Constructor
    public PersonData(String name,
                      Person.Gender gender,
                      String birthDate,
                      String phoneNumber,
                      int personId,
                      int age,
                      int height,
                      int weight,
                      Person.PersonState personState,
                      Person.PersonRole personRole) {

        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.personId = personId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.personState = personState;
        this.personRole = personRole;
    }
}