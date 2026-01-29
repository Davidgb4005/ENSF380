package Location;

public abstract class DisasterStrategy {
    int disaster_strategy_id;
    String strategy_name;

    abstract public void evacuationStrategy();
    abstract public void emergencyBroadcast();

    public String getStrategyName() {
        return this.strategy_name;
    }

   public void setStrategyName(String _name) {
        if (_name == null) {
            System.out.println("Strategy Name cannot be null");
            return;
        }
        this.strategy_name = _name;
    }
}
