package strategy2;

public class TransportToAirport {
    private StrategyOfTransport strategy;

    public TransportToAirport(StrategyOfTransport strategy) {
        this.strategy = strategy;
    }

    public void transport(){
        strategy.transport();
    }
}
