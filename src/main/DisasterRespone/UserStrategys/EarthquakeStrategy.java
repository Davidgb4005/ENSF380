package UserStrategys;
import Location.DisasterStrategy;

public class EarthquakeStrategy extends DisasterStrategy {
    @Override
    public void evacuationStrategy() {
        System.out.println("EarthQuake");
    }

    @Override
    public void emergencyBroadcast() {
        System.out.println("EarthQauke Broadcast");
    }
}