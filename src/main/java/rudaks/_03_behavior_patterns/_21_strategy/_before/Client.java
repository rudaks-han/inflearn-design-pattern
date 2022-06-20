package rudaks._03_behavior_patterns._21_strategy._before;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(1);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
