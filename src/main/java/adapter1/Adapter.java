package adapter1;

public class Adapter implements NewFunctionalityInterface {
    private OddFunctionality oldObject;

    public Adapter() {
        oldObject = new OddFunctionality();
    }

    @Override
    public void divide() {
        System.out.println("New functionality is to divide by 3:");
        System.out.println(oldObject.getRandom()/3);
    }

}
