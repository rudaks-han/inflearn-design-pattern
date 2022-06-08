package rudaks._01_creational_patterns._03_abstract_factory.exercise.after;

public class HyundaiCarFactory implements Car {

    private CarPartsFactory carPartsFactory;

    public HyundaiCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;

        System.out.println("hyundai car");
    }

    @Override
    public void create() {
        carPartsFactory.createMotor();
        carPartsFactory.createWheel();
    }
}
