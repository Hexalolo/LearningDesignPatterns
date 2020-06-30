package abstractFactory2;

public class Victorian extends FurnitureDecorator{

    public Victorian(Furniture decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public String getStyle() {
        return "victorian";
    }

    @Override
    public int getNumberOfLegs() {
        return decoratedFurniture.getNumberOfLegs();
    }

    @Override
    public boolean sitOn() {
        return decoratedFurniture.sitOn();
    }

    @Override
    public String getFurniture() {
        return decoratedFurniture.getFurniture();
    }
}
