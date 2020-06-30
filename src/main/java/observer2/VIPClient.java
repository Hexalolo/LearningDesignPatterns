package observer2;

public class VIPClient implements Observer{

    @Override
    public void update() {
        System.out.println("End of the work for " + this.getClass().getName());
    }
}
