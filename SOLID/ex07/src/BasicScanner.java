public class BasicScanner implements IScanner {
    @Override
    public void scan(String dstPath) {
        System.out.println("Scan to: " + dstPath);
    }
}