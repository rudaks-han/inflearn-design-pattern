package rudaks._01_creational_patterns._03_abstract_factory.exercise.before;

public class Client {

    public static void main(String[] args) {
        Car hyundaiCar = CarFactory.create("hyundai");
    }
}
