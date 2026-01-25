package Location;

public class DisasterStrategy {

    void evacuationStrategy() {
        System.out.println("Default evacuation strategy");
    }

    void emergencyBroadcast() {
        System.out.println("Default emergency broadcast");
    }
}

class EarthquakeStrategy extends DisasterStrategy {

    @Override
    void evacuationStrategy() {
        System.out.println("Drop, cover, and hold on. Evacuate after shaking stops.");
    }

    @Override
    void emergencyBroadcast() {
        System.out.println("Earthquake reported. Stay indoors until shaking stops.");
    }
}

class FloodStrategy extends DisasterStrategy {

    @Override
    void evacuationStrategy() {
        System.out.println("Move to higher ground immediately.");
    }

    @Override
    void emergencyBroadcast() {
        System.out.println("Flood warning issued. Avoid low-lying areas.");
    }
}

class HurricaneStrategy extends DisasterStrategy {

    @Override
    void evacuationStrategy() {
        System.out.println("Evacuate coastal areas. Follow designated evacuation routes.");
    }

    @Override
    void emergencyBroadcast() {
        System.out.println("Hurricane approaching. Secure property and evacuate if ordered.");
    }
}
