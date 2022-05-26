package rudaks.creational_pattern._02_factory._03_after;

public class WhiteshipFactory extends ShipFactory {
    @Override
    public Ship createShip() {
        return new Ship("whiteship", "white", "white logo");
    }
}
