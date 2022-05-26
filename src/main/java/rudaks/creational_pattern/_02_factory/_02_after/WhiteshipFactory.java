package rudaks.creational_pattern._02_factory._02_after;

public class WhiteshipFactory extends ShipFactory {
    @Override
    public Ship createFactory() {
        return new Ship("whiteship", "white", "white logo");
    }
}
