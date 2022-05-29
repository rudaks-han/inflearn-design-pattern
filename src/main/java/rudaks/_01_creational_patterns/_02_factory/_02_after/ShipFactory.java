package rudaks._01_creational_patterns._02_factory._02_after;

public abstract class ShipFactory {

    abstract Ship createFactory();

    public Ship orderShip(String name, String email) {
        prepare(name);
        Ship ship = createFactory();
        return ship;
    }

    protected void prepare(String name) {
        System.out.println("preparing " + name);
    }
}
