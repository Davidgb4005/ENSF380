package Location;

public abstract class DisasterStrategy {
    // 1. Fields / State
    private int disasterStrategyId;
    private String strategyName;

    // 2. Abstract Methods (Contract for Subclasses)
    public abstract void evacuationStrategy();
    public abstract void emergencyBroadcast();

    // 3. Concrete Getter
    public String getStrategyName() {
        return this.strategyName;
    }

    // 4. Concrete Setter with Validation
    public void setStrategyName(String name) {
        if (name == null) {
            System.out.println("Strategy Name cannot be null");
            return;
        }
        this.strategyName = name;
    }
}