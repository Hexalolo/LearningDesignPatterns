package abstractFactory2;

public class Chair implements Furniture {
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
        return "Chair";
    }

    @Override
    public String getStyle() {
        return "";
    }
}
