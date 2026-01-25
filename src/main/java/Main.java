import java.util.Vector;
import Location.*;
import Person.*;
public class Main {
    public static void main(String[] args) {
                DisasterStrategyFactory disaster_strategy_factory = DisasterStrategyFactory.getInstance();
                DisasterStrategy earthquake = disaster_strategy_factory.createStrategy(DisasterStrategyFactory.StrategyType.EARTHQUAKE);
                DisasterStrategy flood = disaster_strategy_factory.createStrategy(DisasterStrategyFactory.StrategyType.FLOOD);
                DisasterStrategy hurricane = disaster_strategy_factory.createStrategy(DisasterStrategyFactory.StrategyType.HURRICANE);
                DisasterStrategy fire = disaster_strategy_factory.createStrategy(DisasterStrategyFactory.StrategyType.FIRE);

                PersonFactory person_factory = PersonFactory.getInstance();
                Vector<Person> people = new Vector<Person>();

                LocationFactory locationFactory = LocationFactory.getInstance();
                Location Main = locationFactory.CreateLocation();
                Location Secondary = locationFactory.CreateLocation();
                Location Water =locationFactory.CreateLocation();
                Vector<Location> locations = new Vector<Location>();
                locations.add(Main);
                locations.add(Secondary);
                locations.add(Water);
                Main.setAddress("123 Main Street");
                Main.setPhoneNumber("555-1000");
                Secondary.setAddress("456 Side Street");
                Secondary.setPhoneNumber("555-2000");
                Water.setAddress("789 Water Street");
                Water.setPhoneNumber("555-3000");

                for (int i = 0; i< TestPersonData.PEOPLE.size(); i++){
                            people.add(person_factory.createPerson(TestPersonData.PEOPLE.elementAt(i),locations.elementAt(i%3)));
                }

                for (int i = 0; i< TestPersonData.PEOPLE.size(); i++){
                    System.out.print(people.elementAt(i).getName());
                    System.out.print(" ");
                    System.out.println(people.elementAt(i).getLocation());
                }


                Main.setDisasterStrategy(earthquake);
                Secondary.setDisasterStrategy(flood);
                Water.setDisasterStrategy(hurricane);

                Main.findOccupant("Alice");
                Secondary.findOccupant("Alice");
                Water.findOccupant("Alice"); // not here

                Main.evacuationStrategy();
                Secondary.evacuationStrategy();
                Water.evacuationStrategy();

                Main.emergencyBroadcast();
                Secondary.emergencyBroadcast();
                Water.emergencyBroadcast();

                System.out.println("\nLocation details:");
                Main.setDisasterStrategy(earthquake);
                Main.evacuationStrategy();
    }
        }
