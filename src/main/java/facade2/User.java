package facade2;

public class User implements UserInterface {

    @Override
    public void login() {
        System.out.println("To log in!");
    }

    @Override
    public void register() {
        System.out.println("To register!");
    }
}
