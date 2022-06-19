package rudaks._03_behavior_patterns._22_template._after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);

        CallbackFileProcessor fileProcessor1 = new CallbackFileProcessor("number.txt");
        fileProcessor1.process((result1, number) -> result1 += number);
        System.out.println(result);
    }
}
