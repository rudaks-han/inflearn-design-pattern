package rudaks._03_behavior_patterns._22_template._after;

public class Plus extends FileProcessor {
    public Plus(String path) {
        super(path);
    }
    @Override
    protected int getResult(int result, int line) {
        return result += line;
    }


}
