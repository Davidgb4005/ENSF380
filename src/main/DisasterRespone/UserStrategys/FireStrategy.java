package UserStrategys;

import Location.DisasterStrategy;
public class FireStrategy extends DisasterStrategy {
    @Override
    public void evacuationStrategy() {
        System.out.println("Fire");
    }
    @Override
    public void emergencyBroadcast() {
        System.out.println("Fire Broadcsat");
    }
}
