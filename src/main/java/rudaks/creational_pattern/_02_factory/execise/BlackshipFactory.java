package rudaks.creational_pattern._02_factory.execise;

public class BlackshipFactory extends ShipFactory {
    @Override
    protected Ship createShip() {
        return new Ship("blackship", "rudaks94@gmail.com");
    }
}
