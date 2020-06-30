// source: http://devman.pl/pl/techniki/wzorce-projektowe-8-fasadafacade/
package facade1;

public class Main {
    public static void main(String[] args) {
        CarFacade facade = new CarFacade(new CarBody(), new CarEngine(), new CarModel(), new CarAccessories());
        facade.createCompleteCar();
        facade.changeMusic();
    }
}
