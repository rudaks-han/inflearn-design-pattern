package rudaks._03_behavior_patterns._23_visitor.exercise.user;

import rudaks._03_behavior_patterns._23_visitor.exercise.action.RegisterAction;
import rudaks._03_behavior_patterns._23_visitor.exercise.action.ResolveAction;

public interface User {

    void transition(RegisterAction registerAction);

    void transition(ResolveAction resolveAction);
}
