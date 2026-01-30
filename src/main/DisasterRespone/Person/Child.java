package Person;

public class Child extends Person {

    // 1. Fields / State
    private Person guardian;

    // 2. Getters and Setters
    public Person getGuardian() {
        return guardian;
    }

    public void setGuardian(Person guardian) {
        this.guardian = guardian;
    }
}