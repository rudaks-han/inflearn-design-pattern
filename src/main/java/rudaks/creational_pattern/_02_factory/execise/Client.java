package rudaks.creational_pattern._02_factory.execise;

public class Client {

    public static void main(String[] args) {
        ShipFactory whiteshipFactory = new WhiteshipFactory();
        whiteshipFactory.orderShip("whiteship", "rudaks94@gmail.com");

        ShipFactory blackShipFactory = new BlackshipFactory();
        blackShipFactory.orderShip("blackship", "rudaks94@gmail.com");
    }
}
