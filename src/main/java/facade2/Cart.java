package facade2;

public class Cart implements CartInterface {
    @Override
    public void getItems() {
        System.out.println("To see all items in the bucket!");
    }
}
