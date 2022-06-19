package rudaks._03_behavior_patterns._22_template.exercise;

public class Client {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.request();

        Beverage tea = new Tea();
        tea.request();
    }
}
