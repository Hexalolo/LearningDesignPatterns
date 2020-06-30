package adapter2;

public class Iphone6 implements Iiphone6 {
    @Override
    public void protectedFromWater(boolean ifProtected) {
        System.out.println("Is it protected from water? "+ifProtected);
    }

    @Override
    public void speedWorking(String speed) {
        System.out.println("Iphone speed: "+speed);
    }

    @Override
    public void sizeOfScreen(int inch) {
        System.out.println("Screen size in inch: "+inch);
    }
}
