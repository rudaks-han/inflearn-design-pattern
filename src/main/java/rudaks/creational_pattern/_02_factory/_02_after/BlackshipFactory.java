package rudaks.creational_pattern._02_factory._02_after;

public class BlackshipFactory extends ShipFactory {
    @Override
    Ship createFactory() {
        return new Ship("blackship", "black", "blackship logo");
    }
}
