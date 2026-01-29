package UserStrategys;
import Location.DisasterStrategy;

public class BlizzardStrategy extends DisasterStrategy{
    @Override
    public void evacuationStrategy() {
        System.out.println("Blizzard");
    }
    @Override
    public void emergencyBroadcast() {
        System.out.println("Blizzard Broadcsat");
    }
};

