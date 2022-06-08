package rudaks._01_creational_patterns._03_abstract_factory.exercise.before;

public class CarFactory {

    public static Car create(String type) {
        if ("hyundai".equals(type)) {
            return new HyundaiCar(new HyundaiMotor(), new HyundaiWheel());
        } else if ("samsung".equals(type)) {
            return new SamsungCar(new SamsungMotor(), new SamsungWheel());
        } else {
            throw new IllegalArgumentException("type is not exists: " + type);
        }
    }
}
