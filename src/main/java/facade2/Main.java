package facade2;

public class Main {
    public static void main(String[] args) {
        API shopApi = new API(new Cart(), new Product(), new User());
        shopApi.register();
        shopApi.login();
        shopApi.getProducts();
        shopApi.getBuyProducts();
        shopApi.getProduct(123);
    }
}
