package rudaks._01_creational_patterns._01_singleton;

public class Settings2 {

    private static final Settings2 INSTANCE = new Settings2();

    private Settings2() {

    }

    public static Settings2 getInstance() {
        return INSTANCE;
    }
}
