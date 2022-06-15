package rudaks._02_structural_patterns._11_proxy.exercise;

public class ProxyService extends HeavyService {

    private HeavyService heavyService;

    public ProxyService(HeavyService heavyService) {
        this.heavyService = heavyService;
    }

    @Override
    public void execute() {
        long start = System.currentTimeMillis();
        heavyService.execute();
        System.out.println("elapsed: " + (System.currentTimeMillis() - start) + "(ms)");
    }
}
