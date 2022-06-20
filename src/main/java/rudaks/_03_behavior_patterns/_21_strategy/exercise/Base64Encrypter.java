package rudaks._03_behavior_patterns._21_strategy.exercise;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encrypter implements EncryptStrategy {
    @Override
    public String encrypt(String str) {
        try {
            return Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
