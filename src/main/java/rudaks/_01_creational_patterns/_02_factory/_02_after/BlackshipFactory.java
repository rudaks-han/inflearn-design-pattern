package rudaks._01_creational_patterns._02_factory._02_after;

public class BlackshipFactory extends ShipFactory {
    @Override
    Ship createFactory() {
        return new Ship("blackship", "black", "blackship logo");
    }
}
