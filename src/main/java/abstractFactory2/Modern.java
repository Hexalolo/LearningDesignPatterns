package abstractFactory2;

public class Modern extends FurnitureDecorator{

    public Modern(Furniture decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public String getStyle() {
        return "modern";
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
