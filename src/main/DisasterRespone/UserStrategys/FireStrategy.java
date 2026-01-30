package UserStrategys;

import Location.DisasterStrategy;

public class FireStrategy extends DisasterStrategy {

    // 1. Implementation of Abstract Methods
    @Override
    public void evacuationStrategy() {
        System.out.println("Fire");
    }

    @Override
    public void emergencyBroadcast() {
        System.out.println("Fire Broadcast");
    }
}