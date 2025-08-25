public class Demo07 {
    public static void main(String[] args) {
        IPrinter printer = new BasicPrinter();
        printer.print("Hello");
        
        IScanner scanner = new BasicScanner();
        scanner.scan("/tmp/out");
        
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print("Document");
        mfp.scan("/tmp/scan");
        mfp.fax("555-1234");
    }
}
