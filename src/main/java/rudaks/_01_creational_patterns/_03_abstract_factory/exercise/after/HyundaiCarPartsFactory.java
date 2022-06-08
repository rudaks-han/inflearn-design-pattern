package rudaks._01_creational_patterns._03_abstract_factory.exercise.after;

public class HyundaiCarPartsFactory implements CarPartsFactory {
    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Wheel createWheel() {
        return new HyundaiWheel();
    }
}
