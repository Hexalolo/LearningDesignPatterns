package adapter2;

public class Iphone7 implements Iiphone7 {
    @Override
    public void PhoneIsProtectedFromWater(boolean ifProtected) {
        System.out.println("Is it protected from water? "+ifProtected);
    }

    @Override
    public void SpeedPhoneWorking(String speed) {
        System.out.println("Iphone speed: "+speed);
    }

    @Override
    public void PhoneSizeScreen(int inch) {
        System.out.println("Screen size in inch: "+inch);
    }


}
