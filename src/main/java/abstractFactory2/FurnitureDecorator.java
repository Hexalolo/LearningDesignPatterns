package abstractFactory2;

public abstract class FurnitureDecorator implements Furniture {

    protected Furniture decoratedFurniture;

    public FurnitureDecorator(Furniture decoratedFurniture) {
        this.decoratedFurniture = decoratedFurniture;
    }

    public String getStyle(){
        return "";
    }
}
