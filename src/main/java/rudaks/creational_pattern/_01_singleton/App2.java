package rudaks.creational_pattern._01_singleton;

public class App2 {

    public static void main(String[] args) {
        Settings2 settings1 = Settings2.getInstance();
        Settings2 settings2 = Settings2.getInstance();

        System.out.println(settings1 == settings2);
    }
}
