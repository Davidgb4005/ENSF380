public class Main {
    public static void main(String[] args) {
        Person Alice = new Person();
        Person Rob = new Person();
        Person Tom = new Person();
        Person Bob = new Person();
        Person Jen = new Person();
        Person Bill = new Person();

        Location Main = new Location();
        Location Secondary = new Location();
        Location Water = new Location();

        Main.addPerson(Alice);
        Main.addPerson(Bob);
        Secondary.addPerson(Rob);
        Secondary.addPerson(Tom);
        Secondary.addPerson(Jen);
        Water.addPerson(Bill);
        Main.setAddress("123 Dick Street");
        System.out.println(Alice.getLocation());
    }
}