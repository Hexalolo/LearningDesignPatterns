package facade2;

public class Product implements ProductInterface {
    @Override
    public void getAll() {
        System.out.println("To show all product from category!");
    }

    @Override
    public void get(int id) {
        System.out.println("To show product with certain id: "+id);
    }
}
