package facade1;

public class CarModel implements CarModelInterface {
    @Override
    public void setModel() {
        System.out.println("CarModel - Set Model");
    }
}
