public class BasicPrinter implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}
