package rudaks._01_creational_patterns._05_prototype.exercise;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class RandomNumber implements Cloneable {

    private double number;

    public RandomNumber() {
        this.number = Math.random();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
