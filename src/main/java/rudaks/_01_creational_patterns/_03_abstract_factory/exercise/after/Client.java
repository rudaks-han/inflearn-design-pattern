package rudaks._01_creational_patterns._03_abstract_factory.exercise.after;

public class Client {

    public static void main(String[] args) {
        Car hyundaiCar = new HyundaiCarFactory(new HyundaiCarPartsFactory());
        hyundaiCar.create();
    }
}
