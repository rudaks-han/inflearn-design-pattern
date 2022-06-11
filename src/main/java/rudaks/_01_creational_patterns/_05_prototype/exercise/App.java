package rudaks._01_creational_patterns._05_prototype.exercise;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 일반적으로 객체를 new 해서 생성하면 매번 새로운 객체가 생성된다.
        RandomNumber randomNumber = new RandomNumber();
        RandomNumber newRandomNumber = new RandomNumber();

        System.out.println(randomNumber == newRandomNumber); // false
        System.out.println(randomNumber.equals(newRandomNumber)); // false
        System.out.println(randomNumber.getNumber() == newRandomNumber.getNumber()); // false

        // 이미 만들어진 객체를 복사해서 만드는 방법
        RandomNumber cloneRandomNumber = (RandomNumber) randomNumber.clone();

        System.out.println(randomNumber == cloneRandomNumber); // false
        System.out.println(randomNumber.equals(cloneRandomNumber)); // true
        System.out.println(randomNumber.getNumber() == cloneRandomNumber.getNumber()); // true
    }
}
