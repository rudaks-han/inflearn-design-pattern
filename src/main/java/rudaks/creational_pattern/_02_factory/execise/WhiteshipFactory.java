package rudaks.creational_pattern._02_factory.execise;

public class WhiteshipFactory extends ShipFactory {
    @Override
    protected Ship createShip() {
        return new Ship("whiteship", "rudaks94@gmail.com");
    }
}
