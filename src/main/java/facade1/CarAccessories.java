package facade1;

public class CarAccessories implements CarAccessoriesInterface {
    @Override
    public void setAccessories() {
        System.out.println("CarAccessories - Set Accessories");
    }
    @Override
    public void changeMusic(){
        System.out.println("CarAccessories - Music is changed");
    }
}
