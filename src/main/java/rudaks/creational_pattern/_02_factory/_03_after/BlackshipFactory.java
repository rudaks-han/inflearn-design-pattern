package rudaks.creational_pattern._02_factory._03_after;

public class BlackshipFactory extends ShipFactory {
    @Override
    protected Ship createShip() {
        return new Ship("black", "black", "black logo");
    }
}
