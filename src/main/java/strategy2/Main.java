// source: http://devman.pl/pl/techniki/wzorce-projektowe-strategiastrategy/
package strategy2;

public class Main {
    public static void main(String[] args) {
        TransportToAirport transportToAirport;

        System.out.println("Client wants to get by CityBus");
        transportToAirport = new TransportToAirport(new CityBus());
        transportToAirport.transport();

        System.out.println("Client wants to get by Taxi");
        transportToAirport = new TransportToAirport(new Taxi());
        transportToAirport.transport();

        System.out.println("Client wants to get by Car");
        transportToAirport = new TransportToAirport(new Car());
        transportToAirport.transport();
    }
}
