package Person;

public class PersonData{

    public String name;
    public Person.Gender gender;
    public String birthDate;
    public String phoneNumber;
    public int person_id;
    public int age;
    public int height;
    public int weight;
    public Person.PersonState personState;
    public Person.PersonRole personRole;

    public PersonData(String name,
                      Person.Gender gender,
                      String birthDate,
                      String phoneNumber,
                      int person_id,
                      int age,
                      int height,
                      int weight,
                      Person.PersonState personState,
                      Person.PersonRole personRole) {

        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.person_id = person_id;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.personState = personState;
        this.personRole = personRole;
    }
}
