package UserStrategys;

import Location.DisasterStrategy;

public class FloodStrategy extends DisasterStrategy {

    // 1. Implementation of Abstract Methods
    @Override
    public void evacuationStrategy() {
        System.out.println("Flood");
    }

    @Override
    public void emergencyBroadcast() {
        System.out.println("Flood Broadcast");
    }
}