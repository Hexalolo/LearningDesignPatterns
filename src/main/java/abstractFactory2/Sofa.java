package abstractFactory2;

public class Sofa implements Furniture {
    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public String getFurniture(){
        return "Sofa";
    }

    @Override
    public String getStyle() {
        return "";
    }
}
