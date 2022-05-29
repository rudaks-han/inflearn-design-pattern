package rudaks._01_creational_patterns._02_factory.execise;

public abstract class ShipFactory {

    public Ship orderShip(String name, String email) {
        prepare(name);
        Ship ship = createShip();
        sendEmail(email);

        return ship;
    }

    private void sendEmail(String email) {
        System.out.println("메일 전송: " + email);
    }

    protected abstract Ship createShip();

    private void prepare(String name) {
        System.out.println("준비중: " + name);
    }
}
