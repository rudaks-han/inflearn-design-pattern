package rudaks._03_behavior_patterns._21_strategy._after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.redLight(new Normal());
        game.blueLight(new Faster());
        game.redLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("무광꼬치");
            }

            @Override
            public void redLight() {
                System.out.println("피어씀다.");
            }
        });
    }
}
