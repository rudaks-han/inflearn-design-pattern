package rudaks.creational_pattern._01_singleton;

public class Settings2 {

    private static final Settings2 INSTANCE = new Settings2();

    private Settings2() {

    }

    public static Settings2 getInstance() {
        return INSTANCE;
    }
}
