package rudaks._02_structural_patterns._11_proxy.exercise;

public class Client {

    public static void main(String[] args) {
        ProxyService proxyService = new ProxyService(new HeavyService());
        proxyService.execute();
    }
}
