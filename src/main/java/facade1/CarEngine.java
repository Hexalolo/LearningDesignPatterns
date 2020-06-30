package facade1;

public class CarEngine implements CarEngineInterface {
    @Override
    public void setEngine() {
        System.out.println("CarEngine - Set Engine");
    }
}
