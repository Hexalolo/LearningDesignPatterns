package abstractFactory1;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String animalType){
        if("Dog".equalsIgnoreCase(animalType)) return new White();
        if("Duck".equalsIgnoreCase(animalType)) return new Black();
        if("Bear".equalsIgnoreCase(animalType)) return new Red();
        return null;
    }
}
