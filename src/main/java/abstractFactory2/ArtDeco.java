package abstractFactory2;

public class ArtDeco extends FurnitureDecorator {

    public ArtDeco(Furniture decoratedFurniture) {
        super(decoratedFurniture);
    }

    @Override
    public String getStyle() {
        return "art deco";
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
