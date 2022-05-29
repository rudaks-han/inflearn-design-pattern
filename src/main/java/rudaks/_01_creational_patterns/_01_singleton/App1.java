package rudaks._01_creational_patterns._01_singleton;

public class App1 {

    public static void main(String[] args) {
        Settings1 settings1 = new Settings1();
        Settings1 settings2 = new Settings1();

        System.out.println(settings1 == settings2);
    }
}
