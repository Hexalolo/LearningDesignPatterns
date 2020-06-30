// source: http://devman.pl/pl/techniki/wzorce-projektowe-5-adapteradapter/
package adapter2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iphone 6 parameters:");
        Iphone6 iphone6 = new Iphone6();
        iphone6.protectedFromWater(false);
        iphone6.sizeOfScreen(4);
        iphone6.speedWorking("slow");

        System.out.println("\nIphone 7 parameters:");
        IphoneAdapter adapter = new IphoneAdapter();
        adapter.protectedFromWater(true);
        adapter.sizeOfScreen(5);
        adapter.speedWorking("fast");

    }
}
