package UserStrategys;
import Location.DisasterStrategy;

public class FloodStrategy extends DisasterStrategy {
    @Override
    public void evacuationStrategy() {
        System.out.println("Flood");
    }
    @Override
    public void emergencyBroadcast() {
        System.out.println("Flood Broadcsat");
    }
}