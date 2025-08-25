public class EmailService implements IEmailService {
    private EmailClient emailClient = new EmailClient();
    
    @Override
    public void send(String to, String message) {
        emailClient.send(to, message);
    }
}