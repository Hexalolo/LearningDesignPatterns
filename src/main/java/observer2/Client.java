package observer2;

public class Client implements Observer {

    @Override
    public void update() {
        System.out.println("End of the work! " + this.getClass().getName());
    }
}
