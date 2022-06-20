package rudaks._03_behavior_patterns._21_strategy.exercise;

public class TextEncrypter {

    private EncryptStrategy encryptStrategy;

    public TextEncrypter(EncryptStrategy encryptStrategy) {
        this.encryptStrategy = encryptStrategy;
    }

    public String encrypt(String str) {
        return encryptStrategy.encrypt(str);
    }
}
