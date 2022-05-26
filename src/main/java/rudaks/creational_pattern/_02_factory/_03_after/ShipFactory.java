package rudaks.creational_pattern._02_factory._03_after;

public abstract class ShipFactory {

    public Ship orderShip(String name, String email) {
        prepare(name);
        Ship ship = createShip();
        sendEmail(email);

        return ship;
    }

    private void sendEmail(String email) {
        System.out.println("sending email: " + email);
    }

    protected abstract Ship createShip();

    private void prepare(String name) {
        System.out.println("preparing " + name);
    }
}
