package adapter2;

public class IphoneAdapter implements Iiphone6{
    private Iiphone7 iphone7 = new Iphone7();

    @Override
    public void protectedFromWater(boolean ifProtected) {
        iphone7.PhoneIsProtectedFromWater(ifProtected);
    }

    @Override
    public void speedWorking(String speed) {
        iphone7.SpeedPhoneWorking(speed);
    }

    @Override
    public void sizeOfScreen(int inch) {
        iphone7.PhoneSizeScreen(inch);
    }
}
