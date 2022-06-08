package rudaks._01_creational_patterns._03_abstract_factory.exercise.before;

public class SamsungCar implements Car {

    private SamsungMotor samsungMotor;

    private SamsungWheel samsungWheel;

    public SamsungCar(SamsungMotor samsungMotor, SamsungWheel samsungWheel) {
        this.samsungMotor = samsungMotor;
        this.samsungWheel = samsungWheel;

        System.out.println("Samsung car를 만들었습니다.");
    }
}
