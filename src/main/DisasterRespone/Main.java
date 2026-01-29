import java.util.Vector;
import Location.*;
import Person.*;
import UserStrategys.*;

public class Main {
    public static void main(String[] args) {
                DisasterResponseFacade myApi = new DisasterResponseFacade();
                DisasterStrategy strat_1 = myApi.registerDisasterStratgy(new BlizzardStrategy(),"Blizzard Strat");
                DisasterStrategy strat_2 = myApi.registerDisasterStratgy(new FireStrategy(),"Fire Strat");
                DisasterStrategy strat_3 = myApi.registerDisasterStratgy(new FloodStrategy(),"Flood Strat");
                DisasterStrategy strat_4 = myApi.registerDisasterStratgy(new EarthquakeStrategy(),"EarthQuake strat");
                for (LocationData ld :DummyTestData.LOCATION){
                    Location MyLocation = myApi.NewLocation(ld);
                    myApi.SetLocationStrategy(MyLocation,strat_1);
        }
                int inc = 0;
                for (PersonData pd : DummyTestData.PEOPLE){
                    inc++;
                    myApi.NewPerson(pd, myApi.getLocation(inc%5),(inc%2==0));
                }
                Vector<Person>should_be_allice = myApi.getPersonByName("Alice",null);
                myApi.getLocation(1).evacuationStrategy();
                for(Person p:should_be_allice) {
                    System.out.print(p.getName());
                    System.out.print("   ");
                    System.out.println(p.getLocation());
                }
                Vector<Child> should_be_child = myApi.getChildren(null);
                for(Child p:should_be_child) {
                    System.out.print(p.getName());
                    System.out.print("   ");
                    System.out.println(p.isChild());
                }

                //myApi.TransferPerson();

    }
}
