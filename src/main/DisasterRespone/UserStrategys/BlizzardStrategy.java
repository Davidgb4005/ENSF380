package UserStrategys;

import Location.DisasterStrategy;

public class BlizzardStrategy extends DisasterStrategy {

    // 1. Implementation of Abstract Methods
    @Override
    public void evacuationStrategy() {
        System.out.println("Blizzard");
    }

    @Override
    public void emergencyBroadcast() {
        System.out.println("Blizzard Broadcast");
    }
}