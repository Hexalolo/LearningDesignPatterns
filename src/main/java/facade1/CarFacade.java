package facade1;

public class CarFacade {

    private CarBody body;
    private CarEngine engine;
    private CarModel model;
    private CarAccessories accessories;

    public CarFacade(CarBody body, CarEngine engine, CarModel model, CarAccessories accessories) {
        this.body = body;
        this.engine = engine;
        this.model = model;
        this.accessories = accessories;
    }

    public void createCompleteCar(){
        System.out.println("New car is under construction");
        model.setModel();
        engine.setEngine();
        body.setBody();
        accessories.setAccessories();
        System.out.println("Car is completed");
    }

    public void changeMusic(){
        accessories.changeMusic();
    }
}
