package rudaks._03_behavior_patterns._22_template.exercise_callback;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(((number1, number2) -> number1 + number2));
        System.out.println(result);
    }
}
