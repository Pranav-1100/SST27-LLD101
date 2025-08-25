public class Demo10 {
    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();
        ReportService service = new ReportService(logger);
        service.generate();
    }
}
