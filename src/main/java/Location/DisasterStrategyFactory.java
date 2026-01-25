package Location;

public class DisasterStrategyFactory {

    public enum StrategyType{
        EARTHQUAKE,
        FLOOD,
        HURRICANE,
        FIRE
    }
    private static DisasterStrategyFactory instance = null;  // single instance
    private static int unique_id_counter = 0;      // unique IDs

    private DisasterStrategyFactory() { }

    public static DisasterStrategyFactory getInstance() {
        if (instance == null) {
            instance = new DisasterStrategyFactory();
        }
        return instance;
    }

    public DisasterStrategy createStrategy(StrategyType _type) {
        switch (_type) {
            case FLOOD : return new FloodStrategy();
            case FIRE : return new DisasterStrategy();
            case HURRICANE : return new HurricaneStrategy();
            case EARTHQUAKE : return new EarthquakeStrategy();
            default : return new DisasterStrategy();
        }
    }
}
