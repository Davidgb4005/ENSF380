package Person;

public class Child extends Person {

    private Person guardian;

    public Person getGuardian() {
        return guardian;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }
}
