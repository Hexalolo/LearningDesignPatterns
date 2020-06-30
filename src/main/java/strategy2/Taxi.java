package strategy2;

public class Taxi extends StrategyOfTransport {
    @Override
    public void transport() {
        System.out.println("Client transported by: "+this.getClass().getName());
    }
}
