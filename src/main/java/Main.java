public class Main {
    public static void main(String[] args) {

                Person Alice = new Person();
                Alice.setName("Alice");
                Alice.setAge(30);

                Person Rob = new Person();
                Rob.setName("Rob");
                Rob.setAge(35);

                Person Tom = new Person();
                Tom.setName("Tom");
                Tom.setAge(12);

                Person Bob = new Person();
                Bob.setName("Bob");
                Bob.setAge(40);

                Person Jen = new Person();
                Jen.setName("Jen");
                Jen.setAge(28);

                Person Bill = new Person();
                Bill.setName("Bill");
                Bill.setAge(50);

                Location Main = new Location();
                Location Secondary = new Location();
                Location Water = new Location();

                Main.setAddress("123 Main Street");
                Main.setPhoneNumber("555-1000");

                Secondary.setAddress("456 Side Street");
                Secondary.setPhoneNumber("555-2000");

                Water.setAddress("789 Water Street");
                Water.setPhoneNumber("555-3000");

                Main.addPerson(Alice);
                Main.addPerson(Bob);

                Secondary.addPerson(Rob);
                Secondary.addPerson(Tom);
                Secondary.addPerson(Jen);

                Water.addPerson(Bill);

                Main.setLocationCaptain(Alice);
                Secondary.setLocationCaptain(Rob);
                Water.setLocationCaptain(Bill);

                DisasterStrategy earthquake = new EarthquakeStrategy();
                DisasterStrategy flood = new FloodStrategy();
                DisasterStrategy hurricane = new HurricaneStrategy();

                Main.setDisasterStrategy(earthquake);
                Secondary.setDisasterStrategy(flood);
                Water.setDisasterStrategy(hurricane);

                Main.findOccupant("Alice");
                Secondary.findOccupant("Tom");
                Water.findOccupant("Bob"); // not here

                Main.evacuationStrategy();
                Secondary.evacuationStrategy();
                Water.evacuationStrategy();

                Main.emergencyBroadcast();
                Secondary.emergencyBroadcast();
                Water.emergencyBroadcast();

                System.out.println("\nLocation details:");
                System.out.println(Alice.getName() + " is at " + Alice.getLocation());
                System.out.println(Tom.getName() + " is at " + Tom.getLocation());
            }
        }
