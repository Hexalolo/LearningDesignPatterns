package facade2;

public class API {
    private Cart cart;
    private Product product;
    private User user;

    public API(Cart cart, Product product, User user) {
        this.cart = cart;
        this.product = product;
        this.user = user;
    }

    public void login(){
        user.login();
    }

    public void register(){
        user.register();
    }

    public void getBuyProducts(){
        cart.getItems();
    }

    public void getProducts(){
        product.getAll();
    }

    public void getProduct(int id){
        product.get(id);
    }
}
