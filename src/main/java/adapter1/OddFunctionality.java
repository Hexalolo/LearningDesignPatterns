package adapter1;

public class OddFunctionality {
    private double random;

    public OddFunctionality() {
        random = Math.random();
        System.out.println("Old object created with number: " + random);
    }

    public void multiply(){
        System.out.println("Odd functionality is to multiply by 2:");
        System.out.println(random*2);
    }

    public double getRandom() {
        return random;
    }
}
