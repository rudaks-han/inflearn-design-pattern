package rudaks._01_creational_patterns._04_builder._01_before;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailPlan {

    private int day;

    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
