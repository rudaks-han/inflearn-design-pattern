package rudaks._01_creational_patterns._03_abstract_factory.exercise.before;

public class HyundaiCar implements Car {

    private HyundaiMotor hyundaiMotor;

    private HyundaiWheel hyundaiWheel;

    public HyundaiCar(HyundaiMotor hyundaiMotor, HyundaiWheel hyundaiWheel) {
        this.hyundaiMotor = hyundaiMotor;
        this.hyundaiWheel = hyundaiWheel;

        System.out.println("Hyundai car를 만들었습니다.");
    }
}
