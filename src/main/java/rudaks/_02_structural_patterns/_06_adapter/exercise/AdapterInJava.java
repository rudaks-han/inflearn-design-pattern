package rudaks._02_structural_patterns._06_adapter.exercise;

import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);
        ArrayList<String> list = Collections.list(enumeration);
    }
}
