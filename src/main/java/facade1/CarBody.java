package facade1;

public class CarBody implements CarBodyInterface {
    @Override
    public void setBody() {
        System.out.println("CarBody - Set Body");
    }
}
