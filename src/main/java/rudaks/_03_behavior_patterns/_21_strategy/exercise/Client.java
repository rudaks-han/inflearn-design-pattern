package rudaks._03_behavior_patterns._21_strategy.exercise;

public class Client {

    public static void main(String[] args) {
        TextEncrypter textEncrypter = new TextEncrypter(new Base64Encrypter());
        System.out.println(textEncrypter.encrypt("홍길동"));
    }
}
