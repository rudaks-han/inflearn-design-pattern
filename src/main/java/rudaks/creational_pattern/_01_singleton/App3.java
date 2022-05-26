package rudaks.creational_pattern._01_singleton;

public class App3 {

    public static void main(String[] args) {
        Settings3 settings1 = Settings3.getInstance();
        Settings3 settings2 = Settings3.getInstance();

        System.out.println(settings1 == settings2);
    }
}
