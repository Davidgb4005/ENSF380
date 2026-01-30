package UserStrategys;

import Location.DisasterStrategy;

public class EarthquakeStrategy extends DisasterStrategy {

    // 1. Implementation of Abstract Methods
    @Override
    public void evacuationStrategy() {
        System.out.println("Earthquake");
    }

    @Override
    public void emergencyBroadcast() {
        System.out.println("Earthquake Broadcast");
    }
}