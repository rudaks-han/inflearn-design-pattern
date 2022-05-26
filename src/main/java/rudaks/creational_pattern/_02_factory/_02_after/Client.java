package rudaks.creational_pattern._02_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Ship ship = new WhiteshipFactory().orderShip("whiteship", "rudaks94@gmail.com");
        System.out.println(ship);

        /*Ship blackship = ShipFactory.orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);*/
    }
}
